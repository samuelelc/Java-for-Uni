package prg.es4;

public class Rectangle extends Shape{
	private int width;
	private int length;

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

	public int getWidth(){
		return this.width;
	}

	
	public int getLength(){
		return this.length;
	}

	public int perimeter(){
		return 2*this.getWidth() + 2*this.getLength();
	}

	public int area(){
		return this.getWidth() * this.getLength();
	}
	
	public String toString(){
		return "Rectangle, " + "Colour: " + this.getColour() + ", Fill: " + this.getFill() +", Width: " + this.getWidth() + ", Length: " + this.getLength() + ", Perimeter: " + this.perimeter() + ", Area: " + this.area();
	}

	public Rectangle toPrint(){
		System.out.println(this.toString());
		return this;
	}
}