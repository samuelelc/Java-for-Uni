package prg.testiEsami.es2;

import java.util.Scanner;

public class TestPorto{
	public static void main(String[] args){
		//crea oggetto porto
		
		//menu: inserisci, elimina, avanza, stampa, stampa pericoli

		Porto zonaMarittima = new Porto();
		Scanner input = new Scanner(System.in);
		String choice;
		
		do{
			System.out.println("MENU'");
			System.out.println("1. Inserisci nuova nave");
			System.out.println("2. Elimina nave");
			System.out.println("3. Stampa navi");
			System.out.println("4. Stampa pericoli");
			System.out.println("5. Avanza navi");
			System.out.println("6. Esci dal programma");
			
			System.out.print("Scelta: ");
			choice = input.nextLine();
			switch(choice){
				case "1": 
					zonaMarittima.addNave();
					break;
				case "2":
					System.out.print("Inserisci il codice della nave da eliminare: ");
					String toBeDeleted = input.nextLine();
					zonaMarittima.deleteNave(toBeDeleted);
					break;
				case "3": 
					zonaMarittima.printTraffic();
					break;
				case "4":
					zonaMarittima.pericolo();
					break;
				case "5":
					zonaMarittima.avanza();
					break;
				case "6":
					break;
				default:
					System.out.println("Scelta non valida. Riprova!");
			}
		}while(!choice.equals("6"));
		System.out.println("PROGRAMMA TERMINATO");
	}
}