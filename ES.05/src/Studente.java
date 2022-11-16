package prg.es5;
import java.util.ArrayList;
import prg.es4.Date;

public class Studente{
	private String nome;
	private String cognome;
	private Date data;
	private long matricola;
	private static ArrayList<Long> insiemeMatricole = new ArrayList<>(); 	//memorizza le matricole già impiegate

	//COSTRUTTORI:
	public Studente(String nome, String cognome, Date data, long matricola){
		this.setName(nome);
		this.setSurname(cognome);
		this.setDate(data);
		this.setMatricola(matricola);
	}

	//METODI:
	public Studente setName(String nome){
		this.nome = nome;
		return this;
	}	
	public Studente setSurname(String cognome){
		this.cognome = cognome;
		return this;
	}

	public Studente setDate(Date data){
		this.data = data;
		return this;
	}

	public Studente setMatricola(long matricola){		//formato: 0000000
		if(matricola > 99999 && matricola < 10000000){
			for(Long tmp : insiemeMatricole){	//controllo matricola univoca
				if(tmp.longValue() == matricola){
					System.out.println("Impossibile impostare matricola! Esiste gia' uno studente con tale matricola.");
					return this;
				}
			}
			this.matricola = matricola;
			Long l = Long.valueOf(matricola);
			insiemeMatricole.add(l);
		}
		return this;
	}
	
	public String getName(){
		return this.nome;
	}

	public String getSurname(){
		return this.cognome;
	}

	public Date getDate(){
		return this.data;
	}

	public String stringDate(){
		return this.data.toString2();
	}

	public Studente printDate(){
		System.out.println(this.stringDate());
		return this;
	}

	public long getMatricola(){
		return matricola;
	}

	public Studente print(){
		System.out.printf("%-10s\t%-10s\t%s\t%07d\n", this.getName(), this.getSurname(), this.stringDate(), this.getMatricola());
		return this;
	}
}