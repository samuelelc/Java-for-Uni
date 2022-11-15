package es3;
import java.util.Scanner;

public class TestRazionale{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Razionale r1 = new Razionale();
		Razionale r2 = new Razionale();

		System.out.println("PRIMO NUMERO RAZIONALE:");
		System.out.print("Inserisci Numeratore: ");
		r1.setNum(input.nextInt());
		System.out.print("Inserisci Denominatore: ");
		r1.setDen(input.nextInt());

		System.out.println("SECONDO NUMERO RAZIONALE:");
		System.out.print("Inserisci Numeratore: ");
		r2.setNum(input.nextInt());
		System.out.print("Inserisci Denominatore: ");
		r2.setDen(input.nextInt());

		r1.toPrint();
		r2.toPrint();

		System.out.print("Somma: ");
		r1.sum(r2).toPrint();
		System.out.print("Sottrazione: ");
		r1.sub(r2).toPrint();
		System.out.print("Prodotto: ");
		r1.product(r2).toPrint();
		System.out.print("Divisione: ");
		r1.divide(r2).toPrint();
	}
}