package prg.esame13042022;

public class TestPulisci{
	public static void main(String[] args){
		Forno forno = new Forno(23148, "Rollo", 33.0);
		MacchinaCaffe macchina = new MacchinaCaffe(39434, "Nespresso", "Cialde");
		System.out.println(forno);
		System.out.println(macchina);
		forno.pulisci();
		macchina.pulisci();
		System.out.println(forno);
		System.out.println(macchina);
	}
}