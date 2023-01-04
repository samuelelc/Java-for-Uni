package prg.es4;

import prg.es2.Scalable;
import prg.es2.Drawable;

public class Circle extends Shape{
	private double radius;
	
	//COSTRUTTORI:
	public Circle(){}

	public Circle(int radius){
		this.setRadius(radius);
	}

	//METODI:
	public Circle setRadius(int radius){
		this.radius = Math.abs(radius);
		return this;
	}

	public double getRadius(){
		return this.radius;
	}

	@Override
	public double perimeter(){
		return 2*Math.PI*this.getRadius();
	}

	@Override
	public double area(){
		return Math.PI*Math.pow(this.getRadius(), 2);
	}

	public String toString(){
		return "Circle, " + super.toString() +", Radius: " + this.getRadius() + ", Perimeter: " + Math.round(this.perimeter()) + ", Area: " + Math.round(this.area());
	}

	@Override
	public void draw(){
		System.out.println(this.toString());
	}

	@Override
	public void scale(double factor){
		this.radius *= factor;
	}
}