package prg.esamiPassati.es5;

import java.util.HashMap;
import java.util.Map;

public class Set{
	private int numeroGiochi = 6;
	private Giocatore first, second;
	
	public Set(Giocatore first, Giocatore second){
		this.first = first;
		this.second = second;
	}
	
	public Giocatore simulaSet(){	//output vincitore
		first.resetPoints();
		second.resetPoints();
		this.printPoints();
		while(first.getPoints() != numeroGiochi || second.getPoints() != numeroGiochi){
			int random = (int)(Math.random() * 2);
			if(random == 0){
				first.incrementPoints();
			} else {
				second.incrementPoints();
			}
			this.printPoints();
			if(first.getPoints() == 7 && second.getPoints() <= 5){
				System.out.println("Set vinto da " + first.incrementSetsWon() + ". Risultato: " + stringPoints() + ". Set: " + first + " " + first.getSetsWon() + " - " + second.getSetsWon() + " " + second);
				return first;
			}
			if(second.getPoints() == 7 && first.getPoints() <= 5){
				System.out.println("Set vinto da " + second.incrementSetsWon() + ". Risultato: " + stringPoints() + ". Set: " + first + " " + first.getSetsWon() + " - " + second.getSetsWon() + " " + second);
				return first;
			}
		}
		Giocatore winner = null;
		while(Math.abs(first.getPoints() - second.getPoints()) < 2){
			int random = (int)(Math.random() * 2);
			if(random == 0){
				winner = first.incrementPoints();
			} else {
				winner = second.incrementPoints();
			}
			this.printPoints();
		}
		System.out.println("Set vinto da " + winner.incrementSetsWon() + ". Risultato: " + stringPoints() + ". Set: " + first + " " + first.getSetsWon() + " - " + second.getSetsWon() + " " + second);
		return winner;
	}
	
	private Set printPoints(){
		System.out.println(this.stringPoints());
		return this;
	}
	
	private String stringPoints(){
		String res = first + " " + first.getPoints() + " - " + second.getPoints() + " " + second;
		return res;
	}
}