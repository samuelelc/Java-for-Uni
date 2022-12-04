package prg.es4;

import prg.es2.Scalable;
import prg.es2.Drawable;
import java.lang.Math;

public class Circle extends Shape implements Scalable, Drawable{
	private int radius;
	
	//COSTRUTTORI:
	public Circle(){}

	public Circle(int radius){
		this.setRadius(Math.abs(radius));
	}

	//METODI:
	public Circle setRadius(int radius){
		this.radius = Math.abs(radius);
		return this;
	}

	public int getRadius(){
		return this.radius;
	}

	public double perimeter(){
		return 2*Math.PI*this.getRadius();
	}

	public double area(){
		return Math.PI*Math.pow(this.getRadius(), 2);
	}

	public String toString(){
		return "Circle, " + super.toString() +", Radius: " + this.getRadius() + ", Perimeter: " + Math.round(this.perimeter()) + ", Area: " + Math.round(this.area());
	}

	public void draw(){
		System.out.println(this.toString());
	}

	public void scale(double factor){
		this.radius *= factor;
	}
}