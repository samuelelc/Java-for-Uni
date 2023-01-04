package prg.es2;

import java.util.TreeSet;
import java.util.Scanner;

public class Rubrica{
	Scanner input = new Scanner(System.in);
	TreeSet<Contatto> elenco;

	public Rubrica(){
		elenco = new TreeSet<>();
	}
	
	private Contatto addContact(Contatto newPerson){
		System.out.print("Inserisci Nome: ");
		newPerson.setName(input.nextLine());
		System.out.print("Inserisci Cognome: ");
		newPerson.setSurname(input.nextLine());
		System.out.print("Inserisci numero: ");
		newPerson.setPhone(input.nextLong());
		input = new Scanner(System.in);
		return newPerson;
	}
	
	public Rubrica addFriend(){
		System.out.println("INSERMIMENTO AMICO");
		Friend newFriend = new Friend();
		newFriend = (Friend) this.addContact(newFriend);
		System.out.print("Inserisci indirizzo: ");
		newFriend.setAddress(input.nextLine());
		elenco.add(newFriend);
		return this;
	}
	
	public Rubrica addCollega(){
		System.out.println("INSERMIMENTO COLLEGA");
		Collega newCollega = new Collega();
		newCollega = (Collega) this.addContact(newCollega);
		System.out.print("Inserisci qualifica: ");
		newCollega.setQualifica(input.nextLine());
		elenco.add(newCollega);
		return this;
	}
	
	public Rubrica printFriends(){
		System.out.println("CONTATTI DI AMICI: ");
		boolean check = false;
		for(Contatto id : elenco){
			if(id instanceof Friend){
				System.out.println(id);
				check = true;
			}
		}
		if(check == false){
			System.out.println("Nessun contatto di amici presente");
		}
		return this;
	}

	public Rubrica printColleghi(){
		System.out.println("CONTATTI DI COLLEGHI: ");
		boolean check = false;
		for(Contatto id : elenco){
			if(id instanceof Collega){
				System.out.println(id);
				check = true;
			}
		}
		if(check == false){
			System.out.println("Nessun contatto di colleghi presente");
		}
		return this;
	} 	
	
	public Rubrica toPrint(){
		System.out.println("TUTTI I CONTATTI: ");
		if(elenco.isEmpty()){
			System.out.println("Nessun contatto memorizzato");
		}
		for(Contatto id : elenco){
			System.out.println(id);
		}
		return this;
	}
	
	public Rubrica clear(){
		elenco.clear();
		System.out.println("Rubrica cancellata");
		return this;
	}
	
	public Contatto search(){
		System.out.print("Inserisci nome: ");
		String name = input.next();
		System.out.print("Inserisci cognome: ");
		String surname = input.next();
		for(Contatto id : elenco){
			if(id.getName().equals(name) && id.getSurname().equals(surname)){
				return id;
			}
		}
		System.out.println("Nessun contatto trovato!");
		return null;
	}
}