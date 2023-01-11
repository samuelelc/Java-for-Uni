package prg.esamiPassati.es4;

import java.util.HashMap;

public class Scacchiera{
	private char scacchiera[][];
	private HashMap<Giocatore, Character> simboli = new HashMap<>(2);
	
	public Scacchiera(Giocatore first, Giocatore second){
		 scacchiera = new char[3][3];
		 
		 //inizializza la scacchiera vuota
		 for(int i = 0; i < scacchiera.length; i++){
			for(int j = 0; j < scacchiera[0].length; j++){
				scacchiera[i][j] = ' ';
			}
		 }
		 
		 //imposta il primo giocatore col simbolo 'X' e il secondo con 'O'
		 simboli.put(first, 'X');
		 simboli.put(second, 'O');
	}
	
	public Scacchiera inputMossa(Giocatore player, int[] coordinate){
		if(coordinate.length == 2){	//verifica che l'array delle coordinate abbia dimensione 2
			if(scacchiera[coordinate[1]][coordinate[0]] == ' '){	//verifica che la posizione scelta dalle coordinate sia libera
				scacchiera[coordinate[1]][coordinate[0]] = simboli.get(player);
			} else {
				if(player instanceof GiocatoreUmano){	//nel caso in cui le coordinate siano state inserite da un giocatore umano stampa un messaggio di errore
					System.out.println("Posizione occupata riprova!");
				}
				this.inputMossa(player, player.gioca());	//input di nuove coordinate
			}
		} else {
			System.out.println("Errore");
		}
		return this;
	}
	
	public Scacchiera printScacchiera(){
		System.out.println("  0 1 2");
		System.out.println();
		for(int i = 0; i < scacchiera.length; i++){
			System.out.print(i + " ");
			for(int j = 0; j < scacchiera[0].length; j++){
				System.out.print(scacchiera[i][j]);
				if(j != 2){
					System.out.print("|");
				}
			}
			System.out.println();
			if(i != 2){
				System.out.println("  -----");
			}
		}
		System.out.println("\n");
		return this;
	}
	
	public boolean end(){	//verifica che non ci siano postazioni vuote
		boolean end = true;
		for(int i = 0; i < scacchiera.length; i++){
			for(int j = 0; j < scacchiera[0].length; j++){
				if(scacchiera[i][j] == ' '){
					end = false;
				}
			}
		 }
		if(end == true){
			System.out.println("Partita finita in pareggio!");
		}
		return end;
	}
	
	public boolean win(){
		char win;
		//controlla righe
		for(int i = 0; i < scacchiera.length; i++){
			win = scacchiera[i][0];
			for(int j = 0; j < scacchiera[0].length; j++){
				if(scacchiera[i][j] != win){
					win = ' ';
				}
			}
			if(win != ' '){
				System.out.println(win + " HA VINTO!");
				return true;
			}
		}
		
		//controlla colonne
		for(int i = 0; i < scacchiera[0].length; i++){
			win = scacchiera[0][i];
			for(int j = 0; j < scacchiera.length; j++){
				if(scacchiera[j][i] != win){
					win = ' ';
				}
			}
			if(win != ' '){
				System.out.println(win + " HA VINTO!");
				return true;
			}
		}
		
		//controlla diagonale
		if(scacchiera[1][1] == scacchiera[0][0] && scacchiera[1][1] == scacchiera[2][2] && scacchiera[1][1] != ' '){
			System.out.println(scacchiera[1][1] + " HA VINTO!");
			return true;
		}
		
		//controlla antidiagonale
		if(scacchiera[0][2] == scacchiera[1][1] && scacchiera[1][1] == scacchiera[2][0] && scacchiera[1][1] != ' '){
			System.out.println(scacchiera[1][1] + " HA VINTO!");
			return true;
		}
		
		return false;
	}
}