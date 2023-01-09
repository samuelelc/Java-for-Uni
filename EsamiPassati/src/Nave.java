package prg.testiEsami.es2; 

public class Nave{
	private String code;
	private double x;
	private double y;
	private double speed;
	private double direction;
	private double length;
	private double width;
	private int numberOfPassenger;
	
	//costruttori
	public Nave(String code, double x, double y, double speed, double direction, double length, double width, int numberOfPassenger){
		this.setCode(code).setX(x).setY(y).setSpeed(speed).setDirection(direction).setLength(length).setWidth(width).setPassenger(numberOfPassenger);
	}
	
	//metodi set
	public Nave setCode(String code){
		this.code = code;
		return this;
	}

	public Nave setX(double x){
		this.x = x;
		return this;
	}

	public Nave setY(double y){
		this.y = y;
		return this;
	}

	public Nave setSpeed(double speed){
		this.speed = speed;
		return this;
	}

	public Nave setDirection(double direction){
		this.direction = Math.abs(direction)%360;
		return this;
	}

	public Nave setLength(double length){
		this.length = Math.abs(length);
		return this;
	}

	public Nave setWidth(double width){
		this.width = Math.abs(width);
		return this;
	}

	public Nave setPassenger(int numberOfPassenger){
		this.numberOfPassenger = numberOfPassenger;
		return this;
	}
		
	//metodi get
	
	public String getCode(){
		return this.code;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double getSpeed(){
		return this.speed;
	}
	
	public double getDirection(){
		return this.direction;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public int getPassenger(){
		return this.numberOfPassenger;
	}
	
	//metodo toString
	public String toString(){
		return "CODE: " + this.getCode() + 
		"\tPOSITION: (" + this.getX() + ", " + this.getY() + 
		")\tSPEED: " + getSpeed() + 
		"\tDIRECTION: " + this.getDirection() + 
		"\tDIMENSION: " + this.getLength() + "x" + this.getWidth() + 
		"\tN.PASSENGERS: " + this.getPassenger();
	}
	
	//metodo avanza (vedi suggerimenti)
	public Nave avanza(){
		x+= this.getSpeed()*Math.cos(this.getDirection()*3.14/180);
		y+= this.getSpeed()*Math.sin(this.getDirection()*3.14/180);
		return this;
	}
	
	//metodo equals
	public boolean equals(Object other){	//dato che il codice è univoco, è assurdo che esistano due navi con stesso codice => sono la stessa nave
		if(other instanceof Nave){
			Nave otherNave = (Nave) other;
			if( this.getCode().equals(otherNave.getCode())){
				return true;
			}
		}
		return false;
	}
	
	public double distance(Nave other){
		return Math.sqrt(Math.pow(this.getX()-other.getX(), 2) + Math.pow(this.getY()-other.getY(), 2));
	}
	
}