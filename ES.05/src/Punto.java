package es1;

public class Punto{
	private double x;
	private double y;

	//COSTRUTTORI:
	public Punto(){}

	public Punto(double x, double y){
		this.setX(x);
		this.setY(y);
	}

	//METODI:
	public Punto setX(double x){
		this.x = x;
		return this;
	}

	public Punto setY(double y){
		this.y = y;
		return this;
	}

	public void setXY(double x, double y){
		this.setX(x);
		this.setY(y);
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public String toString(){
		return "(" + this.getX() + " , " + this.getY() + ")";
	}

	public boolean equals(Punto p){
		if(this.distance(p) == 0){
			return true;
		} else {
			return false;
		}
	}

	public double distance(Punto p){
		return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(),2));
	}

	public Punto middlePoint(Punto p){
		Punto m = new Punto((this.getX() + p.getX())/2 , (this.getY() + p.getY())/2);
		return m;
	}
}