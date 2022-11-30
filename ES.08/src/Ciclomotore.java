package prg.es3;

public class Ciclomotore extends VeicoloAMotore{
	private long numTelaio;

	//Costruttori:
	public Ciclomotore(){}
	
	public Ciclomotore(long numTelaio){
		this.setTelaio(numTelaio);
	}

	public Ciclomotore(double ax, double ay){
		super(ax, ay);
	}

	public Ciclomotore(double x, double y,  double vx, double vy, double ax, double ay){
		super(x, y, vx, vy, ax, ay);
	}

	//Metodi set:
	public Ciclomotore setTelaio(long valore){
		this.numTelaio = valore;
		return this;
	}

	//Metodi get:
	public long getTelaio(){
		return this.numTelaio;
	}

	//Metodo toString:
	public String toString(){
		return "Numero telaio: " + this.getTelaio() + ", " +super.toString();
	}
	//implementa equals e 
}