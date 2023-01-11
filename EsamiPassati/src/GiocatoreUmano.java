package prg.esamiPassati.es4;

import java.util.Scanner;

public class GiocatoreUmano extends Giocatore{
	public GiocatoreUmano(){}
	
	@Override
	public int[] gioca(){
		int[] coordinate = new int[2];
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Inserisci coordinata x: ");
			coordinate[0] = input.nextInt();
			System.out.print("Inserisci coordinata y: ");
			coordinate[1] = input.nextInt();
		}while((coordinate[0]<0 || coordinate[0]>2) && (coordinate[1]<0 || coordinate[1]>2));
		return coordinate;
	}
}