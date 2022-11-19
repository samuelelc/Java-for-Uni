package prg.es3;

public class TestTelevoto{
	public static void main(String[] args) {
		Televoto tlv = new Televoto();

		tlv.printPartecipanti();
		tlv.printVotanti();	//inizialmente vuoto

		//ACQUISIZIONE VOTI:
		tlv.getVote("0000000000", "Lazza");
		tlv.getVote("0000000000", "Tananai");
		tlv.getVote("0000000000", "Fedez");
		tlv.getVote("0000000000", "Fedez");
		tlv.getVote("0000000000", "Pinguini Tattici Nucleari");
		tlv.getVote("0000000000", "Psicologi");	//sesto tentativo di inserire un voto
		tlv.getVote("034234 343", "Coez");
		tlv.getVote("3394848 34", "Buffon");	//voto non valido
		tlv.getVote("3324 42 4 ", "Marco Mengoni");
		tlv.getVote("433 44 33 ", "Rhove");
		tlv.getVote("44 4 4 4 4", "Franco126");
		tlv.getVote("433 44 33 ", "Franco126");
		tlv.getVote("433 44 33 ", "Psicologi");
		tlv.getVote("1234567890", "Luche'");
		tlv.getVote("1234567890", "Tananai");
		tlv.getVote("44 4 4 4 4", "Maneskin");

		//RISULTATI:
		System.out.println("\n\nRISULTATI: ");
		System.out.println("Totale voti: " + tlv.totaleVotiRegistrati());

		tlv.printPartecipanti();
		tlv.printVotanti();
	}
}