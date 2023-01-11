package prg.testiEsami.es3;

import java.util.Scanner;

public class TestSeggio{
	public static void main(String[] args){
		//ciclo infinito che chiede matricola e codice di controllo
		
		//se i dati immessi sono corretti stampa lista numerata di candidati + 0. scheda bianca e fa votare
		
		//stampa i risultati dello spoglio dopo ogni voto
		
		Seggio seggio = new Seggio();
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.println("VOTAZIONI RAPPRESENTANTI DEGLI STUDENTI");
			System.out.print("Inserisci matricola: ");
			long matricola = input.nextLong();
			System.out.print("Inserisci control Code: ");
			long controlCode = input.nextLong();
			if(seggio.verificaUtente(matricola, controlCode)){
				System.out.println("Fai la tua scelta: ");
				System.out.println("0. Scheda bianca");
				seggio.stampaElencoCandidati();
				
				System.out.println();
				System.out.print("Scelta: ");
				seggio.vota(input.nextInt());
				
				seggio.spoglio();
				System.out.println();
			}
		}
	}
}