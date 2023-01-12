package prg.esamiPassati.es5;

import java.util.HashMap;
import java.util.Map;

public class Set{
	private int numeroGiochi = 6;
	private Map<Giocatore, Integer> score;
	private Giocatore first, second;
	
	public Set(Giocatore first, Giocatore second){
		this.first = first;
		this.second = second;
		this.score = new HashMap<>(2);
	}
	
	private Giocatore setScore(int giocoVinto){ //ritorna il giocatore che ha acquistato il punto
		Giocatore winner;
		if(giocoVinto == 0){
			winner = this.first;
			this.score.put(this.first, score.get(first) + 1);
		} else {
			winner = this.second;
			this.score.put(this.second, score.get(second) + 1);
		}
		//Stampa risultato parziale
		System.out.println(this.score.get(first) + " - " + this.score.get(second));
		return winner;
	}
	
	public Giocatore simulaSet(){	//output vincitore
		this.score.put(first, 0);
		this.score.put(second, 0);
		System.out.println("0 - 0");
		while(score.get(first) != 6 || score.get(second) != 6){
			int giocoVinto = (int) (Math.random()*2.0);
			this.setScore(giocoVinto);
			if(score.get(first) == 7 && score.get(second) <= 5){
				System.out.println(first + " ha vinto il set " + score.get(first) + " - " + score.get(second));
				return first;			
			}
			if(score.get(first) <= 5 && score.get(second) == 7){
				System.out.println(second + " ha vinto il set " + score.get(first) + " - " + score.get(second));
				return second;
			}
		}
		Giocatore winner = first;
		while(Math.abs(score.get(first)-score.get(second)) < 2){
			int giocoVinto = (int) (Math.random()*2.0);
			winner = this.setScore(giocoVinto);
		}
		System.out.println(winner + " ha vinto il set " + score.get(first) + " - " + score.get(second));
		return winner;
	}
}