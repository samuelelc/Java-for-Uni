package prg.es4;

import prg.es2.Drawable;

public class Shape implements Drawable{
	private String colour;
	private boolean fill;
	private static String[] setOfColours = {"Red", "Orange", "Yellow", "Blue", "Black"};

	//METODI:
	public Shape fillOn(){
		fill = true;
		return this;
	}

	public Shape fillOff(){
		fill = false;
		return this;
	}

	public Shape setColour(String colour){
		boolean check = false;
		for(String tmp : setOfColours){
			if(tmp.equals(colour)){
				this.colour = colour;
				check = true;
			}
		}
		if(check == false){
			System.out.println("Colore non valido.");
		}
		return this;
	}

	public boolean getFill(){
		return this.fill;
	}

	public String getColour(){
		return this.colour;
	}

	public String toString(){
		return ", Colour: " + this.getColour() + ", Fill: " + this.getFill();
	}

	public void draw(){
		System.out.println(this.toString());
	}
}