package prg.es09;
import prg.es07.Abbonato;
import prg.es07.AbbonatoPremium;

public class TestAbbonato{
	public static void main(String[] args) {
		Servizio abbsys = new Servizio();

		//										NOME				COGMOME 		ETA
		abbsys.newAbbonato(new Abbonato(		"Mario", 			"Rossi", 		22));
		abbsys.newAbbonato(new Abbonato(		"Marco", 			"Verdi", 		22));
		abbsys.newAbbonato(new Abbonato(		"Giulio",			"Gialli", 		37));
		abbsys.newAbbonato(new Abbonato(		"Carmelo", 			"Marroni",		70));
		abbsys.newAbbonato(new Abbonato(		"Giuseppe", 		"Bianchi", 		12));
		abbsys.newAbbonato(new Abbonato(		"Francesco", 		"Neri",			22));
		abbsys.newAbbonato(new AbbonatoPremium(	"Carla",			"Blu", 			33));
		abbsys.newAbbonato(new AbbonatoPremium(	"Raffaella", 		"Beige",		22));
		abbsys.newAbbonato(new AbbonatoPremium(	"Flavia", 			"Rossi", 		33));
		abbsys.newAbbonato(new AbbonatoPremium(	"Giulia", 			"Viola", 		23));
		abbsys.newAbbonato(new AbbonatoPremium(	"Alberto", 			"Celeste", 		45));
		abbsys.newAbbonato(new AbbonatoPremium(	"Claudio", 			"Trasparente", 	50));
		abbsys.newAbbonato(new AbbonatoPremium(	"Violetta", 		"Indaco", 		44));

		//STAMPA INIZIALE
		System.out.println("PRIMA------------------------------------------------------------------");
		abbsys.printAbbonati();
		System.out.println();
		abbsys.printAbbonatiPremium();
		System.out.println();

		//MODIFICHE 
		Abbonato abb0 = abbsys.getAbbonato(0);
		abb0.setSconto(0.30f);
		
		Abbonato abb6 = abbsys.getAbbonato(6);
		abb6.setSconto(0.40f);

		//STAMPA FINALE
		System.out.println("DOPO-------------------------------------------------------------------");
		abbsys.printAbbonati();
		System.out.println();
		abbsys.printAbbonatiPremium();
		System.out.println();

		System.out.println("L'abbonato 0 deve pagare: " + abb0.acquista(250));
		System.out.println("L'abbonato 6 deve pagare: " + abb6.acquista(700));

	}
}