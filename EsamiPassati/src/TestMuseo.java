package prg.testEsame.es1;

import java.util.Scanner;

public class TestMuseo{
	public static void main(String[] args){
		Museo museo = new Museo("Museo Himera", "Roma, via Roma 8");
		String choice;
		Scanner input = new Scanner(System.in); 
		do{
			System.out.println("MENU'");
			System.out.println("1. Aggiungi opera");
			System.out.println("2. Stampa tutte le opere");
			System.out.println("3. Elimina opera");
			System.out.println("4. Cerca opera");
			System.out.println("5. Esci");
			
			System.out.println();
			System.out.print("Scelta: ");
			choice = input.nextLine();
			switch(choice){
				case "1":
					String secondChoice;
					System.out.println("L'opera che vuoi aggiungere è:'");
					System.out.println("1. Scultura");
					System.out.println("2. Dipinto");
					System.out.println();
					System.out.print("Scelta: ");
					secondChoice = input.nextLine();
					switch(secondChoice){
						case "1":
							System.out.print("Inserisci titolo: ");
							String title = input.nextLine();
							System.out.print("Inserisci autor: ");
							String author = input.nextLine();
							System.out.print("Inserisci data: ");
							String date = input.nextLine();
							System.out.print("Inserisci materiale: ");
							String material = input.nextLine();
							System.out.print("Inserisci altezza in cm: ");
							int height = input.nextInt();
							input = new Scanner(System.in);
							
							museo.newOpera(new Scultura(title, author, date, material, height));
							break;
						case "2":
							System.out.print("Inserisci titolo: ");
							title = input.nextLine();
							System.out.print("Inserisci autor: ");
							author = input.nextLine();
							System.out.print("Inserisci data: ");
							date = input.nextLine();
							System.out.print("Inserisci tecnica: ");
							String tecnica = input.nextLine();
							System.out.print("Inserisci larghezza: ");
							int size1 = input.nextInt();
							System.out.print("Inserisci altezza: ");
							int size2 = input.nextInt();
							input = new Scanner(System.in);
							
							
							museo.newOpera(new Dipinto(title, author, date, tecnica, size1, size2));
							break;
						default:
							System.out.print("Scelta non valida!");
					}
					
					break;
					
				case "2":
					museo.printOpere();
					break;
				
				case "3":
					System.out.print("Inserisci titolo dell'opera da eliminare: ");
					String title = input.nextLine();
					museo.removeOpera(title);
					break;
				case "4":
					System.out.print("Inserisci titolo dell'opera da cercare: ");
					title = input.nextLine();
					System.out.println(museo.searchOpera(title));
					break;
				case "5":
					break;
				default:
					System.out.println("Scelta non valida. Riprova!");
					break;
			}
			
		}while(!choice.equals("5"));
		System.out.print("PROGRAMMA TERMINATO");
	}
}