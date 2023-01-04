package prg.es2;

public class Friend extends Contatto{
	private String address;
	
	public Friend(){}
	
	public Friend(String name, String surname, long phone, String address) {
		super(name, surname, phone);
		this.setAddress(address);
	}
	
	//METODI SET
	public Friend setAddress(String address){
		this.address = address;
		return this;
	}
	
	//METODI GET
	public String getAddress(){
		return this.address;
	}

	@Override
	public boolean equals(Object other){
		if(other instanceof Friend){
			Friend sec = (Friend) other;
			return this.getName().equals(sec.getName()) && this.getSurname().equals(sec.getSurname()) && this.getPhone() == sec.getPhone() && this.getAddress().equals(sec.getAddress());
		}
		return false;
	}
	
	@Override
	public String toString(){
		return super.toString() + this.getAddress();
	}
}