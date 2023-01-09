package prg.testiEsami.es2;

import java.util.ArrayList;
import java.util.Scanner;

public class Porto{
	//fa avanzare tutte le navi che possiede
	//inserimento e eliminazione natanti
	//monitora pericolo
	
	private ArrayList<Nave> traffic = new ArrayList<>();
	
	public Porto avanza(){
		for(Nave tmp : traffic){
			tmp.avanza();
		}
		return this;
	}
	
	public Porto addNave(){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci codice: ");
		String code = input.nextLine();
		System.out.println("Inserisci coordinata x: ");
		double x = input.nextDouble();
		System.out.println("Inserisci coordinata y: ");
		double y = input.nextDouble();
		System.out.println("Inserisci velocita': ");
		double speed = input.nextDouble();
		System.out.println("Inserisci direzione: ");
		double direction = input.nextDouble();
		System.out.println("Inserisci lunghezza nave: ");
		double length = input.nextDouble();
		System.out.println("Inserisci larghezza nave: ");
		double width = input.nextDouble();
		System.out.println("Inserisci numero passeggeri: ");
		int numberOfPassenger = input.nextInt();
		traffic.add(new Nave( code,  x,  y,  speed,  direction,  length,  width,  numberOfPassenger));
		return this;
	}
	
	public Porto addNave(Nave newNave){
		Nave naveTrovata = searchNave(newNave.getCode());
		if( naveTrovata == null){
			traffic.add(newNave);
		} else {
			System.out.println(naveTrovata + "è gia' presente nel traffico navale");
		}
		
		return this;
	}
	
	public Porto addNave(String code, double x, double y, double speed, double direction, double length, double width, int numberOfPassenger){
		traffic.add(new Nave(code, x, y, speed, direction, length, width, numberOfPassenger));
		return this;
	}
	
	
	public Porto deleteNave(String code){
		Nave toBeDeleted = searchNave(code);
		if(toBeDeleted != null){
			traffic.remove(toBeDeleted);
			System.out.println("La nave" + toBeDeleted + "e' stata eliminata con successo");
		} else {
			System.out.println("Nave non presente nel traffico navale");
		}
		return this;
	}
	
	public Nave searchNave(String code){
		for(Nave tmp : traffic){
			if(tmp.getCode().equals(code)){
				return tmp;
			}
		}
		return null;
	}
	
	public Porto pericolo(){
		boolean check = false;
		for(int i = 0; i < traffic.size() - 1; i++){
			for(int j = i + 1; j < traffic.size(); j++){
				if(traffic.get(i).distance(traffic.get(j)) < 200){
					System.out.println("PERICOLO: " + traffic.get(i).getCode() + "(" + traffic.get(i).getX() + ", " + traffic.get(i).getY() +")\t" + traffic.get(j).getCode() + "(" + traffic.get(j).getX() + ", " + traffic.get(j).getY() +")");
					check = true;
				}
			}
		}
		if(check == false){
				System.out.println("Non e' stato rilevato alcun pericolo");
		}
		return this;
	}
	
	public Porto printTraffic(){
		System.out.println("TRAFFICO: ");
		if(traffic.isEmpty()){
			System.out.println("Nessuna nave presente nel porto");
		}
		for(Nave tmp : traffic){
			System.out.println(tmp);
		}
		return this;
	}
	
}