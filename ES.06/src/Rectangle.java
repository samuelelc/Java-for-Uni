package prg.es4;

import prg.es2.Scalable;
import prg.es2.Drawable;

public class Rectangle extends Shape{
	private double width;
	private double length;

	//COSTRUTTORI:
	public Rectangle(){}

	public Rectangle(int width, int length){
		this.setWidth(Math.abs(width));
		this.setLength(Math.abs(length));
	}

	//METODI:
	public Rectangle setWidth(int width){
		this.width = Math.abs(width);
		return this;
	}
	
	public Rectangle setLength(int length){
		this.length = Math.abs(length);
		return this;
	}

	public double getWidth(){
		return this.width;
	}

	
	public double getLength(){
		return this.length;
	}

	@Override
	public double perimeter(){
		return 2*this.getWidth() + 2*this.getLength();
	}

	@Override
	public double area(){
		return this.getWidth() * this.getLength();
	}
	
	public String toString(){
		return "Rectangle, " + super.toString() +", Width: " + this.getWidth() + ", Length: " + this.getLength() + ", Perimeter: " + this.perimeter() + ", Area: " + this.area();
	}

	@Override
	public void draw(){
		System.out.println(this.toString());	
	}

	@Override
	public void scale(double factor){
		this.width *= factor;
		this.length *= factor;
	}
}