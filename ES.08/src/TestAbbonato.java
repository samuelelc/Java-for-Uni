package prg.es2;

public class TestAbbonato{
	public static void main(String[] args) {
		Servizio abbsys = new Servizio();

		abbsys.newAbbonato(new Abbonato(Mario, Rossi, 0.12f));
		abbsys.newAbbonato(new Abbonato(Marco, Verdi, 0.22f));
		abbsys.newAbbonato(new Abbonato(Giulio, Gialli, 0.37f));
		abbsys.newAbbonato(new Abbonato(Carmelo, Marroni,0.70f));
		abbsys.newAbbonato(new Abbonato(Giuseppe, Bianchi, 0.12f));
		abbsys.newAbbonato(new Abbonato(Francesco, Neri,0.22f));
		abbsys.newAbbonato(new AbbonatoPremium(Carla, Blu, 0.33f));
		abbsys.newAbbonato(new AbbonatoPremium(Raffaella, Beige, 0.22f));
		abbsys.newAbbonato(new AbbonatoPremium(Flavia, Rossi, 0.33f));
		abbsys.newAbbonato(new AbbonatoPremium(Giulia, Viola, 0.23f));
		abbsys.newAbbonato(new AbbonatoPremium(Alberto, Celeste, 0.45f));
		abbsys.newAbbonato(new AbbonatoPremium(Claudio, Trasparente, 0.50f));
		abbsys.newAbbonato(new AbbonatoPremium(Violetta, Indaco, 0.44f));

		abbsys.printAbbonati();
		System.out.println();
		abbsys.printAbbonatiPremium();

		Abbonato abb0 = abbsys.getAbbonato(0).setDiscount(0.50f).addToBasketValue(300);
		Abbonato abb7 = abbsys.getAbbonato(7).setDiscount(0.40f).addToBasketValue(560);

		abbsys.printAbbonati();
		System.out.println();
		abbsys.printAbbonatiPremium();

		System.out.println();

		System.out.println("L'abbonato 0 deve pagare: " + abb0.applyDiscount());
		System.out.println("L'abbonato 7 deve pagare: " + abb7.applyDiscount());

	}
}