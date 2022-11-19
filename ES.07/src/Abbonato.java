package prg.es2;

import prg.es2.Persona;

public class Abbonato extends Persona{
	private float discount;				//percentuale di sconto
	private float basketValue = 0;

	public Abbonato(){}

	public Abbonato(String name, String surname){
		super(name, surname);
	}

	public Abbonato(String name, String surname, int age){
		super(name, surname, age);
	}

	public Abbonato(String name, String surname, float discount){
		super(name, surname);
		this.setDiscount(discount);
	}

	public void setDiscount(int percent){		//50 = 50 percento
		if(percent < 100 && percent >= 0){
			this.discount = (float) percent/100;
		}
	}

	public void setDiscount(float percent){	//0.50 = 50 percento
		if(percent < 1 && percent >= 0){
			this.discount = percent; 
		}
	}

	public float getDiscount(){
		return this.discount;
	}

	public float applyDiscount(){
		return this.getBasketValue() * (1 - this.getDiscount());
	}

	public void addToBasketValue(float price){
		this.setBasketValue(this.getBasketValue()+price);
	}

	public void removeToBasketValue(float price){
		this.setBasketValue(this.getBasketValue()-price);
	}

	private void setBasketValue(float value){	//do solo la possibilita di aggiungere  e rimuove valore al carrello e non di settarlo direttamente. per cui imposto il metodo come private
		this.basketValue = value;
	}

	public float getBasketValue(){
		return this.basketValue;
	}

	public String toString(){
		return super.toString() +
		 "Valore Carrello: +" + this.getBasketValue() + "$ "+
		"Sconto: -" + this.getDiscount()*100 + "% " +
		"Totale: " + this.applyDiscount() + "$ ";
	}
}