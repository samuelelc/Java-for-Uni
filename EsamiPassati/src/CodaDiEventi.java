package prg.esamiPassati.es6;

import java.util.PriorityQueue;
import java.util.Scanner;

public class CodaDiEventi{
	private PriorityQueue<Evento> queue = new PriorityQueue<>();
	private int idFree;
	
	public CodaDiEventi(){
		idFree = 0; 
	}
	
	public CodaDiEventi addEvento(){
		Scanner input = new Scanner(System.in);
		System.out.println("Seleziona tipo di evento");
		System.out.println("1. Evento tastiera");
		System.out.println("2. Evento mouse\n");
		
		System.out.print("Scelta: ");
		int choice = input.nextInt();
		input = new Scanner(System.in);
		switch(choice){
			case 1:
				System.out.print("Inserisci descrizione: ");
				String description = input.nextLine();
				System.out.print("Inserisci tasto (int): ");
				int tasto = input.nextInt();
				System.out.print("Inserisci modificatore (int) : ");
				EventoTastiera newEventoTastiera = new EventoTastiera(idFree++, description, tasto, input.nextInt());
				queue.add(newEventoTastiera);
				break;
			case 2:
				System.out.print("Inserisci descrizione: ");
				description = input.nextLine();
				System.out.print("Inserisci coordinata x (int): ");
				int x = input.nextInt();
				System.out.print("Inserisci coordinata y (int): ");
				int y = input.nextInt();
				System.out.print("Inserisci pressione tasto sinistro (int): ");
				int sxP = input.nextInt();
				System.out.print("Inserisci pressione tasto destro (int): ");
				EventoMouse newEventoMouse = new EventoMouse(idFree++, description, x, y, sxP, input.nextInt());
				queue.add(newEventoMouse);
				break;
			default:
				break;
		}
		return this;
	}
	
	public Evento estraiEvento(){
		Evento EventDeleted = queue.poll();
		if(EventDeleted != null){
			System.out.println("Evento completato " + EventDeleted);
		} else {
			System.out.println("Nessun evento in coda");
		}
		return EventDeleted;
	}
		
	public String toString(){
		String res = "";
		for(Evento tmp : this.queue){
			res += tmp + "\n";
		}
		return res;
	}
}