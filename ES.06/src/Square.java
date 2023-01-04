package prg.es4;

import prg.es2.Drawable;

public class Square extends Rectangle{
	
	//COSTRUTTORI:
	public Square(){}
	
	public Square(int side){
		this.setSide(side);
	}

	//METODI:
	public Square setSide(int side){
		super.setWidth(side);
		super.setLength(side);
		return this;
	}

	@Override
	public Square setWidth(int side){
		this.setSide(side);
		return this;
	}
	
	@Override
	public Square setLength(int side){
		this.setSide(side);
		return this;
	}

	public String toString(){
		return "Square, " + "Colour: " + this.getColour() + ", Fill: " + this.getFill() +", Side: " + this.getWidth() + ", Perimeter: " + this.perimeter() + ", Area: " + this.area();
	}

	@Override
	public void draw(){
		System.out.println(this.toString());
	}
}