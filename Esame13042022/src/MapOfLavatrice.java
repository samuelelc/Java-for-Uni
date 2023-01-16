package prg.esame13042022;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class MapOfLavatrice{
	private SortedMap<String, Lavatrice> allLavatrice = new TreeMap<>();	//ordinate per modello
	
	
	public MapOfLavatrice add(String marca, String modello, int capacita){
		this.add(new Lavatrice(marca, modello, capacita));
		return this;
	}
	
	public MapOfLavatrice add(Lavatrice newLavatrice){
		allLavatrice.put(newLavatrice.getModello(), newLavatrice);
		
		return this;
	}
	
	public MapOfLavatrice add(){
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci marca: ");
		String marca = input.nextLine();
		System.out.print("Inserisci modello: ");
		String modello = input.nextLine();
		System.out.print("Inserisci capacita': ");
		this.add(marca, modello, input.nextInt());
		return this;
	}
	
	public MapOfLavatrice remove(String modello){
		if(allLavatrice.remove(modello)!=null){
			System.out.print("Rimozione avvenuta con successo");
		} else {
			System.out.print("Modello non presente nella Map");
		}
		return this;
	}
	
	public MapOfLavatrice print(){
		System.out.println(new TreeSet<>(allLavatrice.values()));
		return this;
	}
} 