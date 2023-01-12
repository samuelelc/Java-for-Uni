package prg.esamiPassati.es5;

import java.util.Scanner;

public class TestTennis{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name;
		
		//creazione primo giocatore
		System.out.println("CREAZIONE PRIMO GIOCATORE");
		System.out.println("Inserisci NOME giocatore: ");
		name = input.nextLine();
		System.out.println("Inserisci COGNOME giocatore: ");
		Giocatore first = new Giocatore(name, input.nextLine());
		
		//creazione secondo giocatore
		System.out.println("CREAZIONE SECONDO GIOCATORE");
		System.out.println("Inserisci NOME giocatore: ");
		name = input.nextLine();
		System.out.println("Inserisci COGNOME giocatore: ");
		Giocatore second = new Giocatore(name, input.nextLine());
		
		Incontro partita = new Incontro(first, second);
		partita.simulaIncontro();
	}
}