package prg.testiEsami.es3;

public class Studente{
	private long matricola;
	private long controlCode;
	private String nome;
	private String cognome;
	private boolean haVotato;
	
	//costruttori
	private Studente(){
		haVotato = false;
	}
	
	public Studente(long matricola, long controlCode){
		this();
		this.setMatricola(matricola).setControlCode(controlCode);
	}
	
	public Studente(long matricola, long controlCode, String nome, String cognome){
		this(matricola, controlCode);
		this.setNome(nome).setCognome(cognome);
	}
	
	//metodi set
	public Studente setMatricola(long matricola){
		this.matricola = matricola;
		return this;
	}
	
	public Studente setControlCode(long controlCode){
		this.controlCode = controlCode;
		return this;
	}
	
	public Studente setNome(String nome){
		this.nome = nome;
		return this;
	}
	
	public Studente setCognome(String cognome){
		this.cognome = cognome;
		return this;
	}
	
	public Studente turnHaVotatoOn(){
		this.haVotato = true;
		return this;
	}
	
	//metodi get
	public long getMatricola(){
		return this.matricola;
	}
	
	
	public long getControlCode(){
		return this.controlCode;
	}
	
	
	public String getNome(){
		return this.nome;
	}
	
	
	public String getCognome(){
		return this.cognome;
	}
	
	
	public boolean getHaVotato(){
		return this.haVotato;
	}

	//metodo toString
	public String toString(){
		return "Matricola: " + this.getMatricola() + "\tControlCode: " + this.getControlCode() + "\tNome: " + this.getNome() + "\tCognome: " + this.getCognome() + "\tHaVotato? " + this.getHaVotato();
 	}
}