package prg.esamiPassati.es5;

public class Giocatore{
	private int posClassifica;
	private String name;
	private String surname;
	private int points;
	private int setsWon;
	
	public Giocatore(String name, String surname){
		this.setName(name).setSurname(surname);
	}
	
	public Giocatore(String name, String surname, int posClassifica){
		this(name, surname);
		this.setPosClassifica(posClassifica);
	}
	
	//metodi set
	public Giocatore setName(String name){
		this.name = name;
		return this;
	}
	
	public Giocatore setSurname(String surname){
			this.surname = surname;
		return this;
	}
	
	public Giocatore setPosClassifica(int pos){
		if(posClassifica > 0 && posClassifica < 20){
			this.posClassifica = posClassifica;
		} else {
			throw new IllegalArgumentException("Posizione in classifica inserita non valida");
		}	
		return this;
	}
	
	private Giocatore setPoints(int points){
		if(points >= 0){
			this.points = points;
		} else {
			throw new IllegalArgumentException("Impossibile inserire punteggio negativo");
		}	
		return this;
	}
	
	private Giocatore setSetsWon(int setsWon){
		if(setsWon >= 0){
			this.setsWon = setsWon;
		} else {
			throw new IllegalArgumentException("Impossibile inserire punteggio negativo");
		}	
		return this;
	}
	
	public Giocatore incrementPoints(){
		this.setPoints(this.getPoints()+1);
		return this;
	}
	
	public Giocatore incrementSetsWon(){
		this.setSetsWon(this.getSetsWon()+1);	
		return this;
	}
	
	public Giocatore resetPoints(){
		this.setPoints(0);
		return this;
	}
	
	public Giocatore resetSetsWon(){
		this.setSetsWon(0);	
		return this;
	}
	
	//metodi get
	public String getName(){
		return this.name;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public int getPosClassifica(){
		return this.posClassifica;
	}
	
	public int getPoints(){
		return this.points;
	}
	
	public int getSetsWon(){
		return this.setsWon;
	}
	
	//toString method
	public String toString(){
		return this.getName() + " " + this.getSurname();
	}
}