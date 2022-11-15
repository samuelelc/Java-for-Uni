package prg.es5;

import prg.es5.Point2D;

public class Line{
	private Point2D p1	= new Point2D();
	private Point2D p2	= new Point2D();

	//COSTRUTTORI:
	public Line(){}

	public Line(Point2D p1, Point2D p2){
		this.setAllPoints(p1, p2);
	}

	public Line(int x1, int y1, int x2, int y2){
		this.setPositionAllPoints(x1, y1, x2, y2);
	}

	//METODI:
	public Line setP1(Point2D p1){
		this.p1.setXY(p1.getX(), p1.getY());
		return this;
	}

	public Line setP2(Point2D p2){
		this.p2.setXY(p2.getX(), p2.getY());
		return this;
	}

	public Line setAllPoints(Point2D p1, Point2D p2){
		return this.setP1(p1).setP2(p2);
	}

	public Line setPositionP1(int x, int y){
		this.p1.setXY(x, y);
		return this;
	}

	public Line setPositionP2(int x, int y){
		this.p2.setXY(x, y);
		return this;
	}

	public Line setPositionAllPoints(int xp1, int yp1, int xp2, int yp2){
		return this.setPositionP1(xp1, yp1).setPositionP2(xp2, yp2);
	}

	public Point2D getP1(){
		return this.p1;
	}

	public Point2D getP2(){
		return this.p2;
	}

	public int getXP1(){
		return this.p1.getX();
	}

	public int getXP2(){
		return this.p2.getX();
	}	

	public int getYP1(){
		return this.p1.getY();
	}

	public int getYP2(){
		return this.p2.getY();
	}

	public String toString(){
		return "Line: " + p1.toString() + " " + p2.toString(); 
	}

	public Line toPrint(){
		System.out.println(this.toString());
		return this;
	}
}