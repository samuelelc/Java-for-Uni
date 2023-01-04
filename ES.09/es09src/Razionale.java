package prg.es09;

public class Razionale extends Numero{

	private int num, den;
	
	public Razionale(int num, int den) {
		setNum(num);
		setDen(den);
	}
	
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setDen(int den) {
		if(den != 0) this.den = den;
		else throw new ArithmeticException("Non puoi mettere zero a denominatore.");
	}
	
	public Razionale somma(Numero r) {
		int n = 0, d = 0;
		if(r instanceof Razionale) {
			Razionale t = (Razionale) r;
			d = this.getDen()*t.getDen();
			n = (this.getNum()*t.getDen()) + (t.getNum()*this.getDen());
			return semplifica(n, d);
		}
		return null;
	}
	
	public Razionale sottrai(Numero r) {
		int n = 0, d = 0;
		if(r instanceof Razionale) {
			Razionale t = (Razionale) r;
			d = this.getDen()*t.getDen();
			n = (this.getNum()*t.getDen()) - (t.getNum()*this.getDen());
			return semplifica(n, d);
		}
		return null;
	}
	
	public void moltiplica(Razionale r) {
		int num = this.getNum() * r.getNum();
		int den = this.getDen() * r.getDen();
		System.out.print("(" + this.getNum() + "/" + this.getDen() + ") * (" + r.getNum() + "/" + r.getDen() + ") = (" + num + "/" + den + ")");
		semplifica(num, den);
	}
	
	public void dividi(Razionale r) {
		int num = this.getNum() * r.getDen();
		int den = this.getDen() * r.getNum();
		System.out.print("(" + this.getNum() + "/" + this.getDen() + ") / (" + r.getNum() + "/" + r.getDen() + ") = (" + num + "/" + den + ")");
		semplifica(num, den);
	}
	
	private Razionale semplifica(int num, int den) {
		Razionale s;
		int n = num, d = den;
		if(num > den) {
			int i = 2;
			System.out.print("(" + num + "/" + den + ")");
			while(i <= d) {
				if(n % i == 0 && d % i == 0) {
					System.out.print(" = (" + n/i + "/" + d/i + ")");
					n /= i;
					d /= i;
				}
				else i++;
			}
		}
		else if (num < den) {
			System.out.print("(" + num + "/" + den + ")");
			int i = 2;
			while(i <= n) {
				if(n % i == 0 && d % i == 0) {
					System.out.print(" = (" + n/i + "/" + d/i + ")");
					n /= i;
					d /= i;
				}
				else i++;
			}
		}
		else System.out.println(" = " + 1);
		System.out.println("");
		s = new Razionale(n, d);
		return s;
	}
	
	public String toString() {
		return "(" + getNum() + "/" + getDen() + ")";
	}
}
