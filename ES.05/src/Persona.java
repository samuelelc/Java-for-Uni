package es2;

public class Persona{
	private String nome = new String();
	private String cognome = new String();
	private int eta;

	//COSTRUTTORI:
	public Persona(){}

	public Persona(String name, String surname, int eta){
		this.setName(name);
		this.setSurname(surname);
		this.setEta(eta);
	}

	public Persona(String name, String surname){
		this.setName(name);
		this.setSurname(surname);
	}

	//METODI:
	public Persona setName(String name){
		this.nome = name;
		return this;
	}

	public Persona setSurname(String surname){
		this.cognome = surname;
		return this;
	}

	public Persona setEta(int eta){
		if(eta >= 0 && eta < 160){
			this.eta = eta;
		} else {
			System.out.println("Errore. Eta' non valida");
		}
		return this;
	}

	public String getName(){
		return this.nome;
	}

	public String getSurname(){
		return this.cognome;
	}

	public int getEta(){
		return this.eta;
	}

	public String toString(){
		return "Nome: " + this.getName() + " Cognome: " + this.getSurname() 	+ " Eta: " + this.getEta();
	}

	public void toPrint(){
		//System.out.println(this.toString());	potrei implementare in questo modo. Tuttavia per ottenere un testo formattato preferisco:
		System.out.printf("Nome: %-15s\tCognome: %-15s\tEta': %d\n", this.getName(), this.getSurname(), this.getEta());
	}

	public boolean equals(Persona soggetto){
		if(this.getName().equalsIgnoreCase(soggetto.getName()) && this.getSurname().equalsIgnoreCase(soggetto.getSurname()) && this.getEta() == soggetto.getEta()){
			return true;
		} else {
			return false;
		}
	}
}