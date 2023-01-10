package prg.testiEsami.es3;

import java.util.ArrayList;

public class Seggio{
	private ArrayList<Studente> allStudents = new ArrayList<>();
	private int schedeBianche;
	private int schedeNonValide;
	
	//costruttori
	public Seggio(){
		allStudents.add(new Studente(24752389, 246142, "Marco", "Rossi"));
		allStudents.add(new Studente(12412453, 33452733, "Gino", "Bianch"));
		allStudents.add(new Studente(1247453, 382133, "Almano", "Pedretti"));
		allStudents.add(new Studente(12772453, 381233, "Dulman", "Codri"));
		allStudents.add(new Studente(1241248653, 383533, "Cicco", "Baletti"));
		allStudents.add(new Studente(1241245883, 3821133, "ECC", "CC"));
		allStudents.add(new Studente(124124553, 3827663, "Simone", "RR"));
		allStudents.add(new Studente(12477323, 38272, "Tamiro", "timone"));
		allStudents.add(new Studente(124124593, 382663, "Balo", "Colini"));
		allStudents.add(new Studente(1241245113, 382743, "Luca", "Biraghi"));
		allStudents.add(new Candidato(124124573, 3827773, "Ciago", "Canetti", "Uguali"));
		allStudents.add(new Candidato(1241245343, 382700, "Gianni", "Bisesi", "Diritto allo studio"));
		allStudents.add(new Candidato(1249912453, 382722, "Carlo", "Lupi", "Liberi"));
		
		schedeBianche = 0;
		schedeNonValide = 0;
	}
	
	//metodi set
	private Seggio setSchedeBianche(int schedeBianche){
		this.schedeBianche = schedeBianche;
		return this;
	}
	
	private Seggio setSchedeNonValide(int schedeNonValide){
		this.schedeNonValide = schedeNonValide;
		return this;
	}
	
	private Seggio incrementaSchedeBianche(){
		this.setSchedeBianche(this.getSchedeBianche() + 1);
		return this;
	}
	
	private Seggio incrementaSchedeNonValide(){
		this.setSchedeNonValide(this.getSchedeNonValide() + 1);
		return this;
	}
	
	//metodi get
	private int getSchedeBianche(){
		return this.schedeBianche;
	}
	
	private int getSchedeNonValide(){
		return this.schedeNonValide;
	}
	
	//verificaUtente
	public boolean verificaUtente(long matricola, long controlCode){
		for(Studente tmp : allStudents){
			if(tmp.getMatricola() == matricola && tmp.getControlCode() == controlCode && tmp.getHaVotato() == false){
				tmp.turnHaVotatoOn();
				System.out.println("Accesso consentito");
				return true;
			}
		}
		System.out.println("Accesso negato. Credenziali sbagliate oppure hai gia' votato.");
		return false;
	}
	
	//stampaElencoCandidati (numerato)
	public Seggio stampaElencoCandidati(){
		int i = 1;
		for(Studente tmp : allStudents){
			if(tmp instanceof Candidato){
				Candidato candidato = (Candidato) tmp;
				System.out.println(i + ". " + candidato.getNome() + candidato.getCognome() + "\tLista: " + candidato.getNomeLista());
				i++;
			}
		}
		return this;
	}
	
	//vota
	public Seggio vota(int numero){
		if(numero == 0){
			this.incrementaSchedeBianche();
			return this;
		}
		boolean check = false;
		int i = 1;
		for(Studente tmp : allStudents){
			if(tmp instanceof Candidato){
				if(i == numero){
					Candidato candidato = (Candidato) tmp;
					candidato.incrementaVoti();
					check = true;
				}
				i++;
			}
		}
		if(check == false){
			this.incrementaSchedeNonValide();
		}
		return this;
	}
	
	//spoglio
	public Seggio spoglio(){
		int totaleVoti = schedeBianche + schedeNonValide;
		int i = 1;
		System.out.println("SPOGLIO: ");
		for(Studente tmp : allStudents){
			if(tmp instanceof Candidato){
				Candidato candidato = (Candidato) tmp;
				System.out.println(i + candidato.getNome() + candidato.getCognome() + "\tLista: " + candidato.getNomeLista() + "\tNumero voti: " + candidato.getNumeroVoti());
				totaleVoti += candidato.getNumeroVoti();
				i++;
			}
		}
		System.out.println("Numero votanti: " + totaleVoti);
		System.out.println("Percentuale voti: " + totaleVoti * 100 / allStudents.size() + "%");
		System.out.println("Numero schede bianche: " + schedeBianche);
		System.out.println("Numero schede nulle: " + schedeNonValide);
		return this;
	}
	/*
	numero votanti
	percentuale votanti
	numero schede bianche
	numero schede nulle
	voti di ciascun candidato*/
}