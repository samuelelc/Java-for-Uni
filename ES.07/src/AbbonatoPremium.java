package prg.es2;

public class AbbonatoPremium extends Abbonato{
 
	public AbbonatoPremium(){}

	public AbbonatoPremium(String name, String surname){
		super(name, surname);
	}

	public AbbonatoPremium(String name, String surname, int age){
		super(name, surname, age);
	}

	public AbbonatoPremium(String name, String surname, float discount){
		super(name, surname, discount);
	}
	
	public float applyDiscount(){
		return super.applyDiscount() - 5*(int)(super.applyDiscount()/100);
	}
}