package prg.es2;

import prg.es3.Numero;

public class Complex extends Numero{
	private double real;
	private double imaginary;
	
	//COSTRUTTORI
	
	public Complex(){}
	
	public Complex(double real){
		this(real, 0);
	}
	
	public Complex(double real, double imaginary){
		this.setReal(real).setImaginary(imaginary);
	}
	
	//Metodi SET
	
	public Complex setReal(double real){
		this.real = real;
		return this;
	}
	
	public Complex setImaginary(double imaginary){
		this.imaginary = imaginary;
		return this;
	}
	
	//Metodi GET
	
	public double getReal(){
		return this.real;
	}
	
	public double getImaginary(){
		return this.imaginary;	
	}
	
	//Operazioni
	
	@Override
	public Numero somma(Numero add){
		if(add instanceof Complex){
			Complex complexAdd = (Complex) add;
			return new Complex(this.getReal() + complexAdd.getReal(), this.getImaginary() + complexAdd.getImaginary());
		} else {
			throw new ArithmeticException("Operandi Eterogenei");
		}
	}
	
	@Override
	public Numero sottrai(Numero sott){
		if(sott instanceof Complex){
			Complex complexSott = (Complex) sott;
			return new Complex(this.getReal() - complexSott.getReal(), this.getImaginary() - complexSott.getImaginary());
		} else {
			throw new ArithmeticException("Operandi Eterogenei");
		}
	}
	
	public double distance(Complex other){
		return Math.sqrt(Math.pow(this.getReal()-other.getReal(), 2)+Math.pow(this.getImaginary()-other.getImaginary(), 2));
	}
	
	//Metodo EQUALS
	
	public boolean equals(Complex other){
		if(Math.abs(this.getReal() - other.getReal()) < 1e-10 && Math.abs(this.getImaginary() - other.getImaginary()) < 1e-10){
			return true;
		}
		return false;
	}
	
	//Metodo TOSTRING
	
	public String toString(){
		if(this.getImaginary()>= 0){
			return this.getReal() + " +i" + this.getImaginary();
		}		
		return this.getReal() + " -i" + Math.abs(this.getImaginary()); 
	}
}