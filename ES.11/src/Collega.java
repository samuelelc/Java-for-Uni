package prg.es2;

public class Collega extends Contatto{
	private String qualifica;
	
	public Collega(){}
	
	public Collega(String name, String surname, long phone, String qualifica) {
		super(name, surname, phone);
		this.setQualifica(qualifica);
	}
	
	//METODI SET
	public Collega setQualifica(String qualifica){
		this.qualifica = qualifica;
		return this;
	}
	
	//METODI GET
	public String getQualifica(){
		return this.qualifica;
	}
	
	@Override
	public boolean equals(Object other){
		if(other instanceof Collega){
			Collega sec = (Collega) other;
			return this.getName().equals(sec.getName()) && this.getSurname().equals(sec.getSurname()) && this.getPhone() == sec.getPhone() && this.getQualifica().equals(sec.getQualifica());
		}
		return false;
	}
	
	@Override
	public String toString(){
		return super.toString() + this.getQualifica();
	}
}