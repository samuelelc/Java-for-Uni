package prg.es5;
import java.util.Scanner;

public class TestPunto{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//CREAZIONE P1
		Punto p1 = new Punto();
		System.out.println("PRIMO PUNTO:");
		System.out.print("Inserisci coordinata x: ");
		p1.x = input.nextDouble();
		System.out.print("Inserisci coordinata y: ");
		p1.y = input.nextDouble();

		//CREAZIONE P2
		Punto p2 = new Punto();
		System.out.println("SECONDO PUNTO:");
		System.out.print("Inserisci coordinata x: ");
		p2.x = input.nextDouble();
		System.out.print("Inserisci coordinata y: ");
		p2.y = input.nextDouble();

		//CALCOLO DISTANZA
		System.out.println("DISTANZA: " + p1.distance(p2));
		/*
		 *	System.out.println("DISTANZA: " + sqrt(pow(x-p.x, 2) + pow(y-p.y, 2))); 
		 */

		//CALCOLO PUNTO MEDIO
		System.out.println("PUNTO MEDIO: " + "(" + (p1.x + p2.x)/2 + " , "+ (p1.y + p2.y)/2 + ")");

		//VERIFICA SE SONO UGUALI
		System.out.println("SONO UGUALI? " + p1.equals(p2));
	}
}