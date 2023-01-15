package prg.esame13042022; 

public class Lavatrice implements Comparable<Lavatrice>{
	private String marca;
	private String modello;
	private int capacita;
	
	public Lavatrice(String marca, String modello, int capacita){
		this.setMarca(marca).setModello(modello).setCapacita(capacita);
	}
	
	public Lavatrice setMarca(String marca){
		this.marca = marca;
		return this;
	}
	
	public Lavatrice setModello(String modello){
		this.modello = modello;
		return this;
	}
	
	public Lavatrice setCapacita(int capacita){
		this.capacita = Math.abs(capacita);
		return this;
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public String getModello(){
		return this.modello;
	}
	
	public int getCapacita(){
		return this.capacita;
	}
	
	public boolean equals(Object other){
		if(other instanceof Lavatrice){
			Lavatrice otherLavatrice = (Lavatrice) other;
			if(this.getMarca().equals(otherLavatrice.getMarca()) && this.getModello().equals(otherLavatrice.getModello())){
				return true;
			}
		}
		return false;
	}
	
	public int hashCode(){
		return this.getMarca().hashCode()+31*this.getModello().hashCode();
	}
	
	public int compareTo(Lavatrice other){
		if(this.getCapacita() > other.getCapacita()){
			return 1;
		} else if (this.getCapacita() < other.getCapacita()){
			return -1;
		} else {
			return 0;
		}
	}
	
	public String toString(){
		return this.getMarca() + " " + this.getModello()+ " " +this.getCapacita();
	}
}