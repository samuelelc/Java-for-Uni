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

	public Abbonato setDiscount(int percent){		//50 = 50 percento
		if(percent < 100 && percent >= 0){
			this.discount = (float) percent/100;
		}
		return this;
	}

	public Abbonato setDiscount(float percent){		//0.50 = 50 percento
		if(percent < 1 && percent >= 0){
			this.discount = percent; 
		}
		return this;
	}

	public float getDiscount(){
		return this.discount;
	}

	public float applyDiscount(){
		return this.getBasketValue() * (1 - this.getDiscount());
	}

	public Abbonato addToBasketValue(float price){
		this.setBasketValue(this.getBasketValue()+price);
		return this;
	}

	public Abbonato removeToBasketValue(float price){
		this.setBasketValue(this.getBasketValue()-price);
		return this;		
	}

	private Abbonato setBasketValue(float value){	//do solo la possibilita di aggiungere  e rimuove valore al carrello e non di settarlo direttamente. per cui imposto il metodo come private
		this.basketValue = value;
		return this;
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