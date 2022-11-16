public class Principale{
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = persona1;

		persona1.nome = "Genoveffo";
		persona1.cognome = "Giriani";
		persona1.eta = 20;

		persona2.nome = "Gennaro";
		persona2.cognome = "Priani";
		persona2.eta = 22;

		persona1.toPrint();
		persona2.toPrint();
		persona3.toPrint();
		System.out.println(persona1.equals(persona2));
	}
}