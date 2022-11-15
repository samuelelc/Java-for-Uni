package prg.es5;

public class Point2D{
	private int x;
	private int y;

	//COSTRUTTORI:
	public Point2D(){}

	public Point2D(int x, int y){
		this.setXY(x, y);
	}

	//METODI:
	public Point2D setX(int x){
		this.x = x;
		return this;
	}

	public Point2D setY(int y){
		this.y = y;
		return this;
	}

	public Point2D setXY(int x, int y){
		this.setX(x);
		return this.setY(y);
	}

	public int getX(){
		return this.x;
	}

	
	public int getY(){
		return this.y;
	}

	public String toString(){
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
}