package prg.es3;

import java.lang.ArithmeticException;
import java.lang.IllegalArgumentException;

public class Razionale extends Numero{
	private int num;
	private int den = 1;

	//COSTRUTTORI:
	public Razionale(){}

	public Razionale(int num, int den){
		this.setNum(num);
		this.setDen(den);
	}

	//METODI:
	public Razionale setNum(int num){
		this.num = num;
		return this;
	}

	public Razionale setDen(int den){
		if(den != 0){
			this.den = den;
		} else {
			throw new IllegalArgumentException("Il denominatore deve essere diverso da 0");
		}
		return this;
	}

	public int getNum(){
		return this.num;
	}

	public int getDen(){
		return this.den;
	}

	private Razionale reduce(){
		if(this.getNum()==0 || this.getDen()==0){
			System.out.println("Numero non trovato");
			return this;
		}
		int min;
		if(Math.abs(this.num) <= Math.abs(this.den)){
			min = Math.abs(this.getNum());
		} else {
			min = Math.abs(this.getDen());
		}
		cerca_numeri_primi:
		for(int i = 2; i <= min; i++){
			for(int j = 2; j < i; j++){
				if(i%j==0){
					continue cerca_numeri_primi;
				}
			}
			while(this.getNum()%i==0 && this.getDen()%i==0){
				this.setNum(this.getNum()/i);
				this.setDen(this.getDen()/i);
			}
		}
		return this;
	}

	@Override
	public Numero somma(Numero add){
		if(add instanceof Razionale){
			Razionale addRazionale = (Razionale) add;
			Razionale result = new Razionale(this.getNum()*addRazionale.getDen()+addRazionale.getNum()*this.getDen(), this.getDen()*addRazionale.getDen());
			return result.reduce();
		} else {
			throw new ArithmeticException();
		}
		
	}

	@Override
	public Numero sottrai(Numero sott){
		if(sott instanceof Razionale){
			Razionale sottRazionale = (Razionale) sott;
			Razionale result = new Razionale(this.getNum()*sottRazionale.getDen()-sottRazionale.getNum()*this.getDen(), this.getDen()*sottRazionale.getDen());
			return result.reduce();
		} else {
			throw new ArithmeticException();
		}
		
	}

	public Numero product(Numero fatt){
		if(fatt instanceof Razionale){
			Razionale fattRazionale = (Razionale) fatt;
			Razionale result = new Razionale(this.getNum() * fattRazionale.getNum(), this.getDen() * fattRazionale.getDen());
			return result.reduce();
		} else {
			throw new ArithmeticException();
		}
	}

	public Razionale divide(Razionale r){
		Razionale result = new Razionale(this.getNum()*r.getDen(), r.getNum()*this.getDen());
		return result.reduce();
	}

	public String toString(){	
		this.reduce();	//Quando il numero viene presentato in output (Stringa o stampato), sarà sempre ridotto ai minimi temini
		return this.getNum() + "/" + this.getDen();
	}

	public void toPrint(){		//Quando il numero viene presentato in output (Stringa o stampato), sarà sempre ridotto ai minimi temini (vedi toString)
		System.out.println(this.toString());
	}

}