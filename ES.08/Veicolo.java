package prg.es3;

public abstract class Veicolo{
	private double x;
	private double y;
	private double vx;
	private double vy;
	private double ax;
	private double ay;

	public abstract void muovi(double tempo);

	//Costruttori:
	public Veicolo(){}

	public Veicolo(double ax, double ay){
		this.setAx(ax).setAy(ay);
	}

	public Veicolo(double x, double y, double vx, double vy, double ax, double ay){
		this(x ,y);
		this.setVx(vx).setVy(vy).setAx(ax).setAy(ay);
	}
	
	//Metodi set:
	public Veicolo setX(double value){
		this.x = value; 
		return this;
	}

	public Veicolo setY(double value){
		this.y = value;
		return this;
	}

	public Veicolo setVx(double value){
		this.vx = value;
		return this;
	}

	public Veicolo setVy(double value){
		this.vy = value;
		return this;
	}

	public Veicolo setAx(double value){
		this.ax = value;
		return this;
	}

	public Veicolo setAy(double value){
		this.ay = value;
		return this;
	}

	
	//Metodi get:
	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double getVx(){
		return vx;
	}

	public double getVy(){
		return vy;
	}

	public double getAx(){
		return ax;
	}

	public double getAy(){
		return ay;
	}

	//Metodo toString:
	public String toString(){
		return "(" + this.getX() + ", " + this.getY() + "), vx = " + this.getVx() + ", vy = " + this.getVy() + ", ax = " + this.getAx() + ", ay = " + this.getAy(); 
	}
	
	//implementa equals e toString
}