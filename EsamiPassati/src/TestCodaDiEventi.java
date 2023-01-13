package prg.esamiPassati.es6;

import java.util.Scanner;

public class TestCodaDiEventi{
	public static void main(String[] args){
		CodaDiEventi queue = new CodaDiEventi();
		Scanner input = new Scanner(System.in);
		int choice;
		do{
			System.out.println("MENU'");
			System.out.println("1. Nuovo evento");
			System.out.println("2. Completa evento");
			System.out.println("3. Stampa coda");
			System.out.println("4. Termina programma\n");
			
			System.out.print("Scelta: ");
			choice = input.nextInt();
			switch(choice){
				case 1:
					queue.addEvento();
					break;
				case 2: 
					queue.estraiEvento();
					break;
				case 3:
					System.out.println(queue.toString());
					break;
				case 4:
					break;
				default: 
					System.out.println("Scelta non valida. Riprova.");
					break;
			}
		}while(choice != 4);
		System.out.println("PROGRAMMA TERMINATO");
	}
}