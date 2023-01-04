// FICARRA
package prg.es09;

public class Complex extends Numero{
	
	private double re, im;
	private String i = "i";
	
	public Complex(){
		setRe(0);
		setIm(0);
	}
	
	public Complex(double re){
		setRe(re);
		setIm(0);
	}
	
	public Complex(double re, double im){
		setRe(re);
		setIm(im);
	}
	
	public double getRe(){
		return re;
	}
	
	public double getIm(){
		return im;
	}
	
	public void setRe(double re){
		this.re = re;
	}
	
	public void setIm(double im){
		this.im = im;
	}
	
	public Complex somma(Complex altro){
		Complex ris = new Complex(this.getRe() + altro.getRe(), this.getIm() + altro.getIm());
		return ris;
	}
	
	public Complex sottrai(Complex altro){
		Complex ris = new Complex(this.getRe() - altro.getRe(), this.getIm() - altro.getIm());
		return ris;
	}
	
	public Complex somma(Numero altro){
		if(altro instanceof Complex) {
			Complex c = (Complex) altro;
			Complex ris = new Complex(this.getRe() + c.getRe(), this.getIm() + c.getIm());
			return ris;
		}
		return null;
	}
	
	public Complex sottrai(Numero altro){
		if(altro instanceof Complex) {
			Complex c = (Complex) altro;
			Complex ris = new Complex(this.getRe() - c.getRe(), this.getIm() - c.getIm());
			return ris;
		}
		return null;
	} 
	
	public String toString(){
		return this.getRe() + " + " + i + this.getIm();
	}
	
/*	public boolean equals(Object o){
		if(o == this) return true;
		else if(o instanceof Complex){
			Complex c = (Complex) o;
			return this.getRe() == c.getRe() && this.getIm() == c.getRe();
		}
		else return false;
	}
	
	public double distanza(Complex altro){
		return Math.sqrt((this.getRe() - altro.getRe()) + (this.getIm() - altro.getIm()));
	}*/
}