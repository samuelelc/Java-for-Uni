package prg.es1;

import java.util.Scanner;

public class TestVectorInteger{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("PRIMO ARRAY");
		VectorInteger first = new VectorInteger(3);
		
		for(int i = 0; i < 3; i++){
			System.out.print(i + ": ");
			first.set(i, input.nextInt());
		}
		
		System.out.println("SECONDO ARRAY");
		VectorInteger second = new VectorInteger(3);
		
		for(int i = 0; i < 3; i++){
			System.out.print(i + ": ");
			second.set(i, input.nextInt());
		}
		
		System.out.print("Inserisci scalare: ");
		int scalare = input.nextInt();
		
		System.out.println(); //---------------------//
		
		System.out.println("PRIMO VETTORE");
		System.out.printf("%-30s\t%s\n", "Primo vettore: ", 	first);
		System.out.printf("%-30s\t%s\n", "Modulo primo vettore: ", first.module());
		System.out.printf("%-30s\t%s\n", "Moltiplicazione per scalare: ", first.multiplicationByScalar(scalare));
		System.out.printf("%-30s\t%s\n", "HashCode: ", first.hashCode());
		System.out.println();

		System.out.println("SECONDO VETTORE");
		System.out.printf("%-30s\t%s\n", "Secondo vettore: ", 	second);
		System.out.printf("%-30s\t%s\n", "Modulo secondo vettore: ", second.module());
		System.out.printf("%-30s\t%s\n", "Moltiplicazione per scalare: ", second.multiplicationByScalar(scalare));
		System.out.printf("%-30s\t%s\n", "HashCode: ", second.hashCode());
		System.out.println();

		System.out.printf("%-30s\t%s\n", "Somma: ", first.sum(second));
		System.out.printf("%-30s\t%s\n", "Sottrazione: ", first.subtract(second));
		System.out.printf("%-30s\t%s\n", "Prodotto scalare: ", first.dotProduct(second));
		System.out.printf("%-30s\t%s\n", "Equals: ", first.equals(second));
		System.out.printf("%-30s\t%s\n", "Compare: ", first.compareTo(second));
		
	}
}