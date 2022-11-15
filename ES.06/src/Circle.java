package prg.es4;

import java.lang.Math;

public class Circle extends Shape{
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
		return "Circle, " + "Colour: " + this.getColour() + ", Fill: " + this.getFill() +", Radius: " + this.getRadius() + ", Perimeter: " + Math.round(this.perimeter()) + ", Area: " + Math.round(this.area());
	}

	public Circle toPrint(){
		System.out.println(this.toString());
		return this;
	}
}