package es1;

import java.util.Scanner;

public class TestPunto{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("PRIMO PUNTO:");
		Punto p1 = new Punto();
		System.out.print("Inserisci coordinata X: ");
		p1.setX(input.nextDouble());
		System.out.print("Inserisci coordinata Y: ");
		p1.setY(input.nextDouble());

		System.out.println("SECONDO PUNTO:");
		Punto p2 = new Punto();
		System.out.print("Inserisci coordinata X: ");
		p2.setX(input.nextDouble());
		System.out.print("Inserisci coordinata Y: ");
		p2.setY(input.nextDouble());

		System.out.println("Distance: " + p1.distance(p2));
		System.out.println("Middle Point: " + p1.middlePoint(p2).toString());
		System.out.println("Equals: " + p1.equals(p2));
	}
}