package prg.esame13042022;

import java.util.Scanner;

public class Forno implements Pulizia{
	private int id;
	private String modello;
	private double temperatura;
	
	public Forno(int id, String modello, double temperatura){
		this.set(id, modello, temperatura);
	}
	
	public Forno set(int id, String modello, double temperatura){
		this.id = id;
		this.modello = modello;
		this.temperatura = temperatura;
		return this;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getModello(){
		return this.modello;
	}
	
	public double getTemperatura(){
		return this.temperatura;
	}
	
	public void pulisci(){
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci nuova temperatura: ");
		this.set(this.id, this.modello, input.nextDouble());
	}
	
	public String toString(){
		return "ID: " + this.getId() + "\tMODELLO: " + this.getModello() + "\tTEMPERATURA: " + this.getTemperatura();
	}
}