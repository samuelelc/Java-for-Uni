package prg.es3;

public class Bicicletta extends Veicolo{
	private String modello;

	public void muovi(double tempo){
		this.setX(this.getX()+this.getVx()*tempo+this.getAx()*Math.pow(tempo, 2));
		this.setY(Math.cos(this.getX()));
		this.setVx(this.getAx()*tempo + this.getVx());
	}

	//Costruttori:
	public Bicicletta(){}
	
	public Bicicletta(String modello){
		this.setModello(modello);
	}

	public Bicicletta(double ax, double ay){
		super(ax, ay);
	}

	public Bicicletta(double x, double y,  double vx, double vy, double ax, double ay){
		super(x, y, vx, vy, ax, ay);
	}

	public Bicicletta setModello(String valore){
		this.modello = valore;
		return this;
	}

	public String getModello(){
		return this.modello;
	}

	//Metodo toString:
	public String toString(){
		return "Modello: " + this.getModello() + ", " + super.toString();
	}
	//implementa equals e toString
}