// LO CASCIO
package prg.es09;
import java.util.ArrayList;

public class TestNumero{
	public static void main(String[] args){
		Razionale r1 = new Razionale(22,3);
		Razionale r2 = new Razionale(1,8);
		Complex c1 = new Complex(2,4);
		Complex c2 = new Complex(4,3);
		
		//Stampa dati iniziali
		System.out.println("DATI INIZIALI");
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
		System.out.println("-----------------------------------------------------");
		
		//OPERAZIONI
		System.out.println("Somma razionali: " + r1 + " + " + r2 + " = " + r1.somma(r2));
		System.out.println("Somma complessi: " + c1 + " + " + c2 + " = " + c1.somma(c2));
		System.out.println("Somma eterogenei: " + c1 + " + " + r2 + " = " + c1.somma(r2));		//STAMPA ERRORE
		System.out.println("Sottrazione razionali: " + r1 + " - " + r2 + " = " + r1.sottrai(r2));
		System.out.println("Sottrazione complessi: " + c1 + " - " + c2 + " = " + c1.sottrai(c2));
		System.out.println("Sottrazione eterogenei: " + c1 + " - " + r2 + " = " + c1.sottrai(r2));		//STAMPA ERRORE
		
		System.out.println("-----------------------------------------------------");
		ArrayList<Numero> l = new ArrayList<>();
		l.add(r1);
		l.add(r2);
		l.add(c1);
		l.add(c2);
		System.out.println("Sottrazione razionali: " + l.get(0) + " - " + l.get(1) + " = " + l.get(0).sottrai(l.get(1)));
		System.out.println("Sottrazione razionali: " + l.get(0) + " - " + l.get(2) + " = " + l.get(0).sottrai(l.get(2)));
		
		
		
	}
}