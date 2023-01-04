package prg.es2;

import java.util.Scanner;

public class TestRubrica{
	public static void main(String[] args){
		Rubrica rubrica = new Rubrica();
		Scanner input = new Scanner(System.in);
		
		//TEST EQUALS e HASHCODE
		System.out.println("Inserisci nome");
		String name = input.nextLine();
		System.out.println("Inserisci cognome");
		String surname = input.nextLine();
		System.out.println("Inserisci numero");
		Long phone = input.nextLong();
		System.out.println("Inserisci qualifica");
		Collega c1 = new Collega(name, surname, phone, input.nextLine());
		
		System.out.println("Inserisci nome");
		name = input.nextLine();
		System.out.println("Inserisci cognome");
		surname = input.nextLine();
		System.out.println("Inserisci numero");
		phone = input.nextLong();
		System.out.println("Inserisci qualifica");
		Collega c2 = new Collega(name, surname, phone, input.nextLine());
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
		/*****************************************************************/
		
		String check;
		do{
			//Stampa menù
			System.out.println("MENU'");
			System.out.println("a) Inserisci nuovo amico");
			System.out.println("b) Inserisci nuovo collega");
			System.out.println("c) Stampa lista amici");
			System.out.println("d) Stampa lista colleghi");
			System.out.println("e) Stampa tutti i contatti");
			System.out.println("f) Cerca numero");
			System.out.println("g) Cancella rubrica");
			System.out.println("h) Esci");
			System.out.println();
			System.out.print("La tua scelta: ");
			check = input.next();
			
			switch(check){
				case "a":
					rubrica.addFriend();
					break;
					
				case "b":
					rubrica.addCollega();
					break;
				case "c":
					rubrica.printFriends();
					break;
				case "d":
					rubrica.printColleghi();
					break;
				case "e":
					rubrica.toPrint();
					break;
				case "f":
					Contatto founded = rubrica.search();
					if(founded != null){
						System.out.println(founded);
					}
					break;
				case "g":
					rubrica.clear();
					break;
				case "h":
					System.out.println("SEI USCITO!");
					break;
				default:
					System.out.println("Scelta non valida. Riprova!");
					break;
			}
		}while(!check.equals("h"));
	}
}