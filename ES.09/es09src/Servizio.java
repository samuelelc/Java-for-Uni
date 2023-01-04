package prg.es09;

import java.util.ArrayList;
import prg.es07.Abbonato;
import prg.es07.AbbonatoPremium;

public class Servizio{
	ArrayList<Abbonato> clienti;

	public Servizio(){
		clienti = new ArrayList<>();
	}

	public void newAbbonato(Abbonato newAbb){
		this.clienti.add(newAbb);
	}

	public void newAbbonato(String nome, String cognome, int eta, boolean abbonatoPremium){
		Abbonato newAbb;
		if(abbonatoPremium == true){
			newAbb = new AbbonatoPremium(nome, cognome, eta);
		} else {
			newAbb = new Abbonato(nome, cognome, eta);
		}
		this.clienti.add(newAbb);
	}

	public void deleteAbbonato(int id){
		this.clienti.remove(id);
	}

	public Abbonato getAbbonato(int id){
		return this.clienti.get(id);
	}

	public void printAbbonati(){
		System.out.println("Lista abbonati: ");
		for(Abbonato abb : this.clienti){
			if(!(abb instanceof  AbbonatoPremium)){
				System.out.println(abb);
			}
		}
	}

	public void printAbbonatiPremium(){
		System.out.println("Lista abbonati premium: ");
		for(Abbonato abb : this.clienti){
			if(abb instanceof  AbbonatoPremium){
				System.out.println(abb);
			}
		}
	}
}