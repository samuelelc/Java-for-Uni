package prg.es3;

public class Automobile extends VeicoloAMotore{
	private String targa;

	//Costruttori:
	public Automobile(){}
	
	public Automobile(String targa){
		this.setTarga(targa);
	}

	public Automobile(double ax, double ay){
		super(ax, ay);
	}

	public Automobile(double x, double y,  double vx, double vy, double ax, double ay){
		super(x, y, vx, vy, ax, ay);
	}

	//Metodi set:
	public Automobile setTarga(String valore){
		this.targa = valore;
		return this;
	}

	//Metodi get:
	public String getTarga(){
		return this.targa;
	}

	//Metodo toString:
	public String toString(){
		return "Targa: " + this.getTarga() + ", " + super.toString();
	}
	//implementa equals e toString
}