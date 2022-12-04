package prg.es4;

public class TestReversedString{
	public static void main(String[] args) {
		String prova = "Stringa di prova";
		ReversedString rs = new ReversedString(prova);
		System.out.println("Stringa invertita: " + rs);
		System.out.println("Lunghezza stringa: " + rs.length());
		System.out.println("Carattere pos = 6: " + rs.charAt(6));
		System.out.println("Carattere pos = 16: " + rs.charAt(16));	//stampa errore
		System.out.println("Sottostringa da 0 a 3: " + rs.subSequence(0,3));
	}
}