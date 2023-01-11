package prg.testiEsami.es3;

public class Candidato extends Studente{
	private String nomeLista;
	private int numeroVoti;
	
	//costruttori
	private Candidato(){
		super();
		this.setNumeroVoti(0);
	}
	
	public Candidato(long matricola, long controlCode, String nomeLista){
		this();
		this.setMatricola(matricola).setControlCode(controlCode);
		this.setNomeLista(nomeLista);
	}
	
	public Candidato(long matricola, long controlCode, String nome, String cognome, String nomeLista){
		this(matricola, controlCode, nomeLista);
		this.setNome(nome).setCognome(cognome);
	}
	
	//metodi set
	public Candidato setNomeLista(String nomeLista){
		this.nomeLista = nomeLista;
		return this;
	}
	
	private Candidato setNumeroVoti(int numeroVoti){
		this.numeroVoti = numeroVoti;
		return this;
	}
	
	public Candidato incrementaVoti(){
		this.setNumeroVoti(this.getNumeroVoti() + 1);
		return this;
	}
	
	
	//metodi get
	
	public String getNomeLista(){
		return this.nomeLista;
	}
	
	public int getNumeroVoti(){
		return this.numeroVoti;
	}

	//metodo toString
	public String toString(){
		return super.toString() + "\tNome Lista: " + this.getNomeLista() + "\tNumero voti: " + this.getNumeroVoti();
	}
	
	
}