package prg.es1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExeption{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try{
			System.out.println("Inserisci double: ");
			double d = input.nextDouble();
		}catch (InputMismatchException exp){
			System.out.println("Dato inserito non e' double");
		}
		System.out.println("Il programma continua");
	}
}