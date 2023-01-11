package prg.esamiPassati.es4;

import java.util.Scanner;

public class Partita{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String choice;
		
		do{
			System.out.println("MENU'");
			System.out.println("1. Gioca contro un altro giocatore");
			System.out.println("2. Gioca contro il computer");
			System.out.println("3. Esci dal gioco");
			
			System.out.println();
			System.out.print("Scelta: ");
			choice = input.nextLine();
			
			switch(choice){
				case "1":
					Giocatore first = new GiocatoreUmano();
					Giocatore second = new GiocatoreUmano();
					Scacchiera scacchiera = new Scacchiera(first, second);
					scacchiera.printScacchiera();
					do{
						//Mossa primo giocatore
						scacchiera.inputMossa(first, first.gioca());
						scacchiera.printScacchiera();
						if(scacchiera.win() || scacchiera.end()){
							break;
						}
						
						//Mossa secondo giocatore
						scacchiera.inputMossa(second, second.gioca());
						scacchiera.printScacchiera();
					}while(!scacchiera.win() && !scacchiera.end());	
					scacchiera.printScacchiera();					
					break;
				case "2":
					first = new GiocatoreUmano();
					second = new GiocatoreComputer();
					scacchiera = new Scacchiera(first, second);
					scacchiera.printScacchiera();
					do{
						//Mossa primo giocatore
						scacchiera.inputMossa(first, first.gioca());
						scacchiera.printScacchiera();
						if(scacchiera.win() || scacchiera.end()){
							break;
						}
						
						//Mossa secondo giocatore
						scacchiera.inputMossa(second, second.gioca());
						scacchiera.printScacchiera();
					}while(!scacchiera.win() && !scacchiera.end());		
					
					break;
				case "3":
					//termina programma
					break;
				default: 
					System.out.println("Scelta non valida. Riprova.");
					break;
			}
			
		}while(!choice.equals("3"));
		System.out.println("PROGRAMMA TERMINATO");
	}
}