package prg.es2;

import java.lang.IllegalArgumentException;
import java.util.Objects;

public class Contatto implements Comparable<Contatto>{
	private String name;
	private String surname;
	private long phone;

	public Contatto(){}

	public Contatto(String name, String surname, long phone){
		this.setName(name).setSurname(surname).setPhone(phone);
	}

	//METODI SET
	public Contatto setName(String name){
		this.name = name;
		return this;
	}

	public Contatto setSurname(String surname){
		this.surname = surname;
		return this;
	}

	public Contatto setPhone(long phone){
		if(phone > 299_999_9999.00){
			this.phone = phone;
		} else {
			throw new IllegalArgumentException();
		}
		return this;
	}
	
	//METODI GET
	public String getName(){
		return this.name;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public long getPhone(){
		return this.phone;
	}
	
	public String toString(){
		return this.getName() + "\t" + this.getSurname() + "\t" + this.getPhone() + "\t";
	}
	
	public boolean equals(Object other){
		if(other instanceof Contatto){
			Contatto sec = (Contatto) other;
			return this.getName().equals(sec.getName()) && this.getSurname().equals(sec.getSurname()) && this.getPhone() == sec.getPhone();
		}
		return false;
	}
	
	public int hashCode(){
		return Objects.hash(this.getName(), this.getSurname(), this.getPhone());
	}
	
	public int compareTo(Contatto other){
		if(this.getSurname().equals(other.getSurname())){
			return this.getName().compareTo(other.getName());
		} else {
			return this.getSurname().compareTo(other.getSurname());
		}
	}
}