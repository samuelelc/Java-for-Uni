package prg.es4;

import prg.es4.Rectangle;

public class TestShape{
	public static void main(String[] args) {
		//TEST COSTRUTTORI
		//inizializzo oggetti con valori arbitrari
		//Shape shape = new Shape();		//da errore in comppilazione perchè Shape è abstract
		Rectangle rettangolo = new Rectangle(8,4);
		Square quadrato = new Square(22);
		Circle cerchio = new Circle(20);

		//TEST toString()
		System.out.println(rettangolo.toString());
		System.out.println(quadrato.toString());
		System.out.println(cerchio.toString());

		//TEST FUNZIONI set E toPrint()
		rettangolo.fillOn().setColour("Orange");
		rettangolo.setWidth(20).setLength(10);
		rettangolo.scale(0.5);
		rettangolo.draw();
		quadrato.fillOn().setColour("Red");
		quadrato.setSide(10);
		rettangolo.scale(0.5);
		quadrato.draw();
		cerchio.fillOn().setColour("Green");	//Green non sarà considerato un colore valido, dunque stamperà errore (vedi setOfColours[] definito nella classe "Shape")
		cerchio.setRadius(23);
		cerchio.scale(0.5);
		cerchio.draw();	
	}
}