package prg.es2;

public class TestAbbonato{
	public static void main(String[] args) {
		System.out.println("TEST ABBONATO");
		Abbonato abb1 = new Abbonato("Mario", "Rossi", 22);

		abb1.setDiscount(20);
		abb1.addToBasketValue(100);
		System.out.println("Sconto: " + abb1.getDiscount() + "Totale su acquisto di 100 dollari: " + abb1.applyDiscount());
		System.out.println(abb1.toString());

		System.out.println("TEST ABBONATO PREMIUM");
		AbbonatoPremium abb2 = new AbbonatoPremium("Marietto", "Gialli", 42);
		abb2.setDiscount(60);
		abb2.addToBasketValue(300);
		System.out.println("Sconto: " + abb2.getDiscount() + "Acquisto di 300 euro: " + abb2.applyDiscount());
		System.out.println(abb2.toString());

	}
}