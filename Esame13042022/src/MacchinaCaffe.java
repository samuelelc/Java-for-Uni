package prg.esame13042022;

import java.util.Scanner;

public class MacchinaCaffe implements Pulizia{
	private int id;
	private String modello;
	private String tipologia;
	
	public MacchinaCaffe(int id, String modello, String tipologia){
		this.set(id, modello, tipologia);
	}
	
	public MacchinaCaffe set(int id, String modello, String tipologia){
		this.id = id;
		this.modello = modello;
		if(tipologia.equals("Cialde") || tipologia.equals("Capsule")){
			this.tipologia = tipologia;
		} else {
			throw new IllegalArgumentException("Tipologia errata");
		}
		return this;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getModello(){
		return this.modello;
	}
	
	public String getTipologia(){
		return this.tipologia;
	}
	
	public void pulisci(){
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci numero di erogazioni: ");
		input.nextLine();
	}
	
	public String toString(){
		return "ID: " + this.getId() + "\tMODELLO: " + this.getModello() + "\tTIPOLOGIA: " + this.getTipologia();
	}
}