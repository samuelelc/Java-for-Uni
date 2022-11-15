package prg.es1;
import java.util.ArrayList;
import java.util.Scanner;

public class Rubrica{
	public static void main(String[] args) {
		ScannerPro input = ScannerPro.getInstance();
		ArrayList<Persona> miaLista = new ArrayList<>();
		String key = new String();
		label:
		while(key != "e"){
			System.out.println("MENU:");
			System.out.println("a. Inserisci nuovo utente");
			System.out.println("b. Cerca persona");
			System.out.println("c. Mostra lista");
			System.out.println("d. Cancella tutta la lista");
			System.out.println("e. Esci");

			switch (key = input.insertString("Inserisci scelta: ")) {
				case "a":	//AGGIUNGI PERSONA
					Persona p1 = new Persona();
					p1.setName(input.insertName());
					p1.setSurname(input.insertString("Inserisci cognome: "));
					p1.setEta(input.insertEta());
					miaLista.add(p1);
					System.out.println();
					break;

				case "b":	//CERCA PER NOME
					String a = input.insertName();
					boolean state = false;
					for(Persona tmp : miaLista){
						if(tmp.getName().equals(a)){
							state = true;
							System.out.println(tmp.getName() + " " + tmp.getSurname() + " " + tmp.getEta());
						}
					}
					if(state == false){
						System.out.println("Non e' presente alcuna persona con il nome " + a + " nella lista");
					}
					System.out.println();
					break;

				case "c":	//MOSTRA INTERA LISTA
					for(Persona tmp : miaLista){
						System.out.printf("%s\t%s\t%d\n", tmp.getName(), tmp.getSurname(), tmp.getEta());
					}
					System.out.println();
					break;

				case "d":	//CANCELLA LISTA
					miaLista.clear();
					System.out.println("Lista cancellata.");
					System.out.println();
					break;

				case "e":	//TERMINA PROGRAMMA
					break label;
			
				default:
					System.out.println("OPZIONE NON VALIDA. Inserire 'a', 'b', 'c', 'd' o 'e'");
					System.out.println();
					break;
			} 
		}
		System.out.println("FINE PROGRAMMA!");
		
	}
}