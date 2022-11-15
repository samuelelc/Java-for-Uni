public class Persona{
	public String nome = new String();
	public String cognome = new String();
	public int eta;

	public void Persona(){

	}

	public void Persona(String n, String c, int e){
		nome = n;
		cognome = c;
		eta = e;
	}

	public void Persona(String n, String c){
		nome = n;
		cognome = c;
	}

	public void toPrint(){
		System.out.printf("Nome: %s\tCognome: %s\tEta: %d\n", nome, cognome, eta);
	}

	public boolean equals(Persona soggetto){
		if(nome.equalsIgnoreCase(soggetto.nome) && cognome.equalsIgnoreCase(soggetto.cognome) && eta == soggetto.eta){
			return true;
		} else {
			return false;
		}
	}
}