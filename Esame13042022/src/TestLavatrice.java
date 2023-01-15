package prg.esame13042022;

import java.util.Scanner;

public class TestLavatrice{
	public static void main(String[] args){
		MapOfLavatrice map = new MapOfLavatrice();
		Scanner input = new Scanner(System.in);
		String choice;
		do{
			System.out.println("MENU'");
			System.out.println("1. Aggiungi Lavatrice");
			System.out.println("2. Rimuovi Lavatrice");
			System.out.println("3. Stampa map");
			System.out.println("4. Esci\n");
			
			System.out.print("Scelta: ");
			choice = input.nextLine();
			switch(choice){
				case "1":
					map.add();
					break;
				case "2":
					System.out.println("Inserisci modello da rimuovere");
					map.remove(input.nextLine());
					break;
				case "3":
					map.print();
					break;
				case "4":
					break;
				default: 
					System.out.println("Scelta non valida");
					break;
				
			}
		}while(!choice.equals("4"));
		System.out.println("PROGRAMMA TERMINATO");
	}
}