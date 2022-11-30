package prg.es3;

public abstract class VeicoloAMotore extends Veicolo{
	private double cilindrata;

	public void muovi(double tempo){
		this.setX(this.getX()+this.getVx()*tempo+this.getAx()*Math.pow(tempo, 2));
		this.setY(this.getY()+this.getVy()*tempo+this.getAy()*Math.pow(tempo, 2));
		this.setVx(this.getAx()*tempo + this.getVx());
		this.setVy(this.getAy()*tempo + this.getVy());
	}

	//Costruttori:
	public VeicoloAMotore(){}

	public VeicoloAMotore(double cilindrata){
		this.setCilindrata(cilindrata);
	}

	public VeicoloAMotore(double ax, double ay){
		super(ax, ay);
	}

	public VeicoloAMotore(double x, double y,  double vx, double vy, double ax, double ay){
		super(x, y, vx, vy, ax, ay);
	}

	//Metodi set:
	public VeicoloAMotore setCilindrata(double value){
		this.cilindrata = value;
		return this;
	}

	//Metodi get: 
	public double getCilindrata(){
		return this.cilindrata;
	}
	
	//Metodo toString:
	public String toString(){
		return "Cilindrata: " + this.getCilindrata() + ", " + super.toString();
	}
	//implementa equals e toString
}