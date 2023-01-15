package prg.esame13042022;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Scanner;

public class MapOfLavatrice{
	private SortedMap<String, Lavatrice> allLavatriceM = new TreeMap<>();	//ordinate per modello
	private SortedMap<Lavatrice, String> allLavatriceC = new TreeMap<>();	//ordinate per capacità
	
	public MapOfLavatrice add(String marca, String modello, int capacita){
		this.add(new Lavatrice(marca, modello, capacita));
		return this;
	}
	
	public MapOfLavatrice add(Lavatrice newLavatrice){
		allLavatriceM.put(newLavatrice.getModello(), newLavatrice);
		allLavatriceC.put(newLavatrice, newLavatrice.getModello());
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
		if(allLavatriceC.remove(allLavatriceM.remove(modello))!=null){
			System.out.print("Rimozione avvenuta con successo");
		} else {
			System.out.print("Modello non presente nella Map");
		}
		return this;
	}
	
	public MapOfLavatrice print(){
		System.out.println(allLavatriceC);
		return this;
	}
} 