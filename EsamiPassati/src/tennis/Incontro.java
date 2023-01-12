package prg.esamiPassati.es5;

import java.util.HashMap;
import java.util.Map;

public class Incontro{
	private Giocatore firstPlayer, secondPlayer;
	private Set firstSet, secondSet, thirdSet;
	private Map<Giocatore, Integer> setVinti;
	
	public Incontro(Giocatore first, Giocatore second){
		firstPlayer = first;
		secondPlayer = second;
		firstSet = new Set(firstPlayer, secondPlayer);
		secondSet = new Set(firstPlayer, secondPlayer);
		thirdSet = new Set(firstPlayer, secondPlayer);
		this.setVinti = new HashMap<>(2);
		this.setVinti.put(this.firstPlayer, 0);
		this.setVinti.put(this.secondPlayer, 0);
	}
	
	private Giocatore refreshSetScore(Giocatore player){ //ritorna il giocatore dato in input (il vincitore del set)
		this.setVinti.put(player, setVinti.get(player) + 1);
		return player;
	}
	
	public Incontro simulaIncontro(){
		System.out.println("INCONTRO TRA " + firstPlayer + " e " + secondPlayer);
		System.out.println("PRIMO SET:");
		refreshSetScore(this.firstSet.simulaSet());
		System.out.println("SECONDO SET:");
		refreshSetScore(this.secondSet.simulaSet());
		if(setVinti.get(firstPlayer) == 2){
			System.out.println(firstPlayer + " HA VINTO LA PARTITA");
			return this;	
		}
		if(setVinti.get(secondPlayer) == 2){
			System.out.println(secondPlayer + " HA VINTO LA PARTITA");
			return this;
		}
		System.out.println("TERZO SET:");
		refreshSetScore(this.thirdSet.simulaSet());
		if(setVinti.get(firstPlayer) == 2){
			System.out.println(firstPlayer + " HA VINTO LA PARTITA");
			return this;
		}
		if(setVinti.get(secondPlayer) == 2){
			System.out.println(secondPlayer + " HA VINTO LA PARTITA");
			return this;		
		}
		
		return this;
	}
}