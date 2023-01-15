package prg.esame13042022;

import java.util.Scanner;

public class TestLibreria{
	public static void main(String[] args){
		Libreria libreria = new Libreria();
		Scanner input = new Scanner(System.in);
		String choice;
		do{
			System.out.println("MENU'");
			System.out.println("1. Aggiungi libro");
			System.out.println("2. Rimuovi libro");
			System.out.println("3. Cerca libro");
			System.out.println("4. Stampa libreria");
			System.out.println("5. Esci");
			
			System.out.print("Scelta: ");
			choice = input.nextLine();
			switch(choice){
				case "1": 
					libreria.addLibro();
					break;
				case "2":
					System.out.print("Inserisci titolo del libro da rimuovere: ");
					libreria.removeLibro(input.nextLine());
					break;
				case "3":
					System.out.print("Inserisci titolo del libro da cercare: ");
					System.out.println(libreria.searchLibro(input.nextLine()));
					break;
				case "4":
					libreria.toPrint();
					break;
				case "5":
					break;
			}
		}while(!choice.equals("5"));
		
		System.out.print("PROGRAMMA TERMINATO");		
	}
}