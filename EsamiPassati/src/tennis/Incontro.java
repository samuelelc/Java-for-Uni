package prg.esamiPassati.es5;

import java.util.HashMap;
import java.util.Map;

public class Incontro{
	private Giocatore firstPlayer, secondPlayer;
	private Set firstSet, secondSet, thirdSet;
	
	public Incontro(Giocatore first, Giocatore second){
		firstSet = new Set(firstPlayer = first, secondPlayer = second);
		secondSet = new Set(firstPlayer, secondPlayer);
		thirdSet = new Set(firstPlayer, secondPlayer);
	}
	
	public Incontro simulaIncontro(){
		System.out.println("INCONTRO TRA " + firstPlayer.resetSetsWon() + " e " + secondPlayer.resetSetsWon());
		System.out.println("PRIMO SET:");
		firstSet.simulaSet();
		System.out.println("SECONDO SET:");
		secondSet.simulaSet();
		if(firstPlayer.getSetsWon() == 2){
			System.out.println(firstPlayer + " HA VINTO LA PARTITA \t Set: " + firstPlayer + " " + firstPlayer.getSetsWon() + " - " + secondPlayer.getSetsWon() + " " + secondPlayer);
			return this;	
		}
		if(secondPlayer.getSetsWon() == 2){
			System.out.println(secondPlayer + " HA VINTO LA PARTITA \t Set: " + firstPlayer + " " + firstPlayer.getSetsWon() + " - " + secondPlayer.getSetsWon() + " " + secondPlayer);
			return this;
		}
		System.out.println("TERZO SET:");
		System.out.println(thirdSet.simulaSet() + " HA VINTO LA PARTITA \t Set: " + firstPlayer + " " + firstPlayer.getSetsWon() + " - " + secondPlayer.getSetsWon() + " " + secondPlayer);
		return this;
	}
}