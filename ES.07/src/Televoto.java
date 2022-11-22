package prg.es3;

import java.util.ArrayList;

public class Televoto{
	private ArrayList<Partecipante> listaPartecipanti = new ArrayList<>();
	private ArrayList<Votante> listaVotanti = new ArrayList<>();

	public Televoto(){
		//IMPOSTAZIONE PARTECIPANTI
		listaPartecipanti.add(new Partecipante("Lazza"));
		listaPartecipanti.add(new Partecipante("Fedez"));
		listaPartecipanti.add(new Partecipante("Villabanks"));
		listaPartecipanti.add(new Partecipante("Mambolosco"));
		listaPartecipanti.add(new Partecipante("Sfera Ebbasta"));
		listaPartecipanti.add(new Partecipante("Franco126"));
		listaPartecipanti.add(new Partecipante("Luche'"));
		listaPartecipanti.add(new Partecipante("Coez"));
		listaPartecipanti.add(new Partecipante("Psicologi"));
		listaPartecipanti.add(new Partecipante("Pinguini Tattici Nucleari"));
		listaPartecipanti.add(new Partecipante("Rhove"));
		listaPartecipanti.add(new Partecipante("Marco Mengoni"));
		listaPartecipanti.add(new Partecipante("Tananai"));
		listaPartecipanti.add(new Partecipante("Maneskin"));
		listaPartecipanti.add(new Partecipante("Capo Plaza"));
	}

	private Votante nuovoVotante(String phone){
		Votante newV = new Votante(phone);
		listaVotanti.add(newV);
		return newV;
	}

	public void getVote(String phone, String nomeConcorrenteScelto){
		Votante votante;
		Partecipante concorrenteScelto;
		votante = this.searchVotante(phone);	//restituisce null se non è presente alcun votante con tale numero di telefono
		if(votante == null){	//se non esiste ancora un votante con tale numero di telefono
			votante = this.nuovoVotante(phone);
		} else if(votante.getVoteCounter() >= 5){
			System.out.println(phone + " NON PUO' VOTARE PIU' DI 5 VOLTE");
			return;
		}
		concorrenteScelto = this.searchPartecipante(nomeConcorrenteScelto); //restituisce null se non è presente alcun partecipante con tale nome
		if(concorrenteScelto != null){
			concorrenteScelto.increaseVoteCounter();
			votante.increaseVoteCounter();
			System.out.println("Voto acquisito da " + votante.getPhone() + " a favore di " + concorrenteScelto.getName());
		} else {
			System.out.println("Nome concorrente non valido ("+nomeConcorrenteScelto+")");
		}
	}

	private Votante searchVotante(String phone){	//cerca nell'ArrayList listaVotanti il votante con il numero di telefono in input e ne restituisce il riferimento 
		for (Votante votante : listaVotanti) {
			if(votante.getPhone().equals(phone)){
				return votante;
			}
		}
		return null;	//restituisce null se non esiste alcun votante con tale numero
	}

	private Partecipante searchPartecipante(String name){		//cerca nell'ArrayList listaPartecipanti il partecipante con il nome in input e ne restituisce il riferimento 
		for (Partecipante partecipante : listaPartecipanti) {
			if(partecipante.getName().equals(name)){
				return partecipante;
			}
		}
		return null;	//restituisce null se non esiste alcun partecipante con tale nome
	}

	public void printVotanti(){
		System.out.println("VOTANTI:");
		if(listaVotanti.isEmpty()){
			System.out.println("Nessun votante registrato");
		}
		for (Votante votante : listaVotanti) {
			System.out.printf("Phone: %10s\tNumeroVoti: %1d\n", votante.getPhone(), votante.getVoteCounter());
			// oppure System.out.println(votante);
		}
	}

	public void printPartecipanti(){
		System.out.println("PARTECIPANTI:");
		for (Partecipante partecipante : listaPartecipanti) {
			System.out.printf("Nome Concorrente: %30s\tNumeroVoti: %6d\n", partecipante.getName(), partecipante.getVoteCounter());	
			// oppure System.out.println(partecipante);
		}
	}

	public int totaleVotiRegistrati(){
		int counter = 0;
		for (Partecipante partecipante : listaPartecipanti) {
			counter += partecipante.getVoteCounter();
		}
		return counter;
	}
}