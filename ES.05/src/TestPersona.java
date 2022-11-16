package prg.es2;

public class TestPersona{
	public static void main(String[] args) {

		//TEST COSTRUTTORI
		Persona p1 = new Persona();
		Persona p2 = new Persona("Mario", "Rossi");
		Persona p3 = new Persona("Francesco", "Gialli", 20);

		//TEST toPrint AND toString
		p1.toPrint();
		p2.toPrint();
		p3.toPrint();

		//TEST set FUNCTIONS
		p1.setName("Mario").setSurname("Rossi");
		p1.setEta(300); //stampa errore
		p1.setEta(10);
		p2.setEta(10);

		p1.toPrint();
		p2.toPrint();
		p3.toPrint();

		//TEST get FUNCTIONS
		System.out.println(p1.getName() + p1.getSurname() + p1.getEta());

		//TEST toString()
		System.out.println(p1.toString());

		//TEST EQUALS
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}