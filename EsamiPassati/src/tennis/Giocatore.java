package prg.esamiPassati.es5;

public class Giocatore{
	private int posClassifica;
	private String name;
	private String surname;
	
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
	
	//toString method
	public String toString(){
		return this.getName() + " " + this.getSurname();
	}
}