package prg.es4;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class CrivelloDiEratostene{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Set<Integer> numeriPrimi = new TreeSet<>();
		Set<Integer> numeriDaRimuovere = new TreeSet<>();
		System.out.print("Inserisci numero intero: ");
		int num;
		try{
			num = input.nextInt();
			if(num < 1){
				throw new IllegalArgumentException();
			}
		} catch(IllegalArgumentException exp){
			exp.printStackTrace();
			num = 100;
		}
		
		for(int i = 1; i <= num; i++){
			numeriPrimi.add(i);
		}

		for(int i = 2; i <= num / 2; i++){
			for (Integer integer : numeriPrimi) {
				if(integer != i && integer % i == 0){
					numeriDaRimuovere.add(integer);
				}
			}
		}

		for (Integer integer : numeriDaRimuovere) {
			numeriPrimi.remove(integer);
		}

		System.out.println("Numeri primi: " + numeriPrimi);
		System.out.println("Numeri non primi: " + numeriDaRimuovere);

	}
}