package prg.es5;
import prg.es4.Date;

public class TestStudente{
	public static void main(String[] args) {
		Date d1 = new Date(3,4,2001);
		Date d2 = new Date(7,2,1999);
		Date d3 = new Date(4,12,2003);
		Studente s1 = new Studente("Mario", "Rossi", d1, 223150);
		Studente s2 = new Studente("Paola", "Rossi", d2, 392293);
		Studente s3 = new Studente("Alberto", "Rossi", d3, 392293);	//stamperà errore perchè la matricola è già assegnata

		s1.print();
		s2.print();
		s3.print();
	}
}