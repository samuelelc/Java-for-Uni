package prg.testEsame.es1;

import java.util.ArrayList;

public class Museo{
	private String name;
	private String address;
	private ArrayList<OperaDArte> listOfArtwork = new ArrayList<>();
	
	
	//costruttori
	public Museo(){}
	
	public Museo(String name, String address){
		this.setName(name).setAddress(address);
	}
	
	//metodi set
	
	public Museo setName(String name){
		this.name = name;
		return this;
	}
	
	public Museo setAddress(String address){
		this.address = address;
		return this;
	}
	
	//metodi get
	
	public String getName(){
		return this.name;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	//newOpera
	
	public Museo newOpera(OperaDArte opera){
		listOfArtwork.add(opera);
		return this;
	}
	
	public Museo newOpera(String title, String author, String date){
		OperaDArte newOpera = new OperaDArte(title, author, date);
		this.newOpera(newOpera);
		return this;
	}
	
	//removeOpera
	public Museo removeOpera(String title){
		OperaDArte toBeDeleted = this.searchOpera(title);
		if(toBeDeleted != null){
			listOfArtwork.remove(toBeDeleted);
		} else {
			System.out.println("Opera non presente!");
		}
		return this;
	}
	
	//searchOpera
	public OperaDArte searchOpera(String title){
		for(OperaDArte opera : listOfArtwork){
			if(opera.getTitle().equals(title)){
				return opera;
			}
		}
		return null;
	}
	
	//printOpere
	public Museo printOpere(){
		System.out.println("LISTA DELLE OPERE DEL MUSEO \"" + this.getName() + "\"");
		for(OperaDArte opera : listOfArtwork){
			System.out.println(opera);
		}
		return this;
	}
	
	
}