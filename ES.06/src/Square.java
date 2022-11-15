package prg.es4;

public class Square extends Rectangle{
	private int width;
	private int length;
	
	//COSTRUTTORI:
	public Square(){}
	
	public Square(int side){
		this.setSide(side);
	}

	//METODI:
	public Square setSide(int side){
		this.width = side;
		this.length = side;
		return this;
	}

	public Square setWidth(int side){
		this.setSide(side);
		return this;
	}
	
	public Square setLength(int side){
		this.setSide(side);
		return this;
	}

	public String toString(){
		return "Square, " + "Colour: " + this.getColour() + ", Fill: " + this.getFill() +", Side: " + this.getWidth() + ", Perimeter: " + this.perimeter() + ", Area: " + this.area();
	}

	public Square toPrint(){
		System.out.println(this.toString());
		return this;
	}
}