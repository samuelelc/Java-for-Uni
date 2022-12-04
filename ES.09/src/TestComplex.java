package prg.es2;

import java.util.Scanner;

public class TestComplex{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		
		//PRIMO NUMERO
		Complex c1 = new Complex();
		System.out.println("Primo numero complesso");
		System.out.print("Inserisci componente reale: \t\t");
		c1.setReal(input.nextDouble());
		System.out.print("Inserisci componente imaginaria: \t");
		c1.setImaginary(input.nextDouble());
		System.out.println("Numero inserito: " + c1);
		
		System.out.println();
		
		//SECONDO NUMERO
		Complex c2 = new Complex();
		System.out.println("Secondo numero complesso");
		System.out.print("Inserisci componente reale: \t\t");
		c2.setReal(input.nextDouble());
		System.out.print("Inserisci componente imaginaria: \t");
		c2.setImaginary(input.nextDouble());
		System.out.println("Numero inserito: " + c2);
		
		System.out.println();
		
		//RISULTATI
		System.out.println("Somma: \t\t(" + c1 + ") + (" + c2 + ") = " + c1.somma(c2));
		System.out.println("Sottrazione: \t(" + c1 + ") - (" + c2 + ") = " + c1.sottrai(c2));
		System.out.println("Sono uguali? " + c1.equals(c2));
 	}
}