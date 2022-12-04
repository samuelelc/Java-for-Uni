package prg.es4;

import java.lang.CharSequence;

public class ReversedString implements CharSequence{
	private String reversedString;
	
	//COSTRUTTORE
	private ReversedString(){
		this.reversedString = "";
	}

	public ReversedString(String string){
		this.reversedString = "";
		for(int i = string.length()-1; i >= 0; i--){
			this.reversedString += string.charAt(i);
		}
	}
	
	//METODI
	public char charAt(int index){
		if(index < this.length()){
			return this.reversedString.charAt(index);
		} else {
			System.out.println("Errore!");
			return ' ';
		}
	}
	
	public int length(){
		return this.reversedString.length();
	}
	
	public CharSequence subSequence(int start, int end){
		ReversedString res = new ReversedString();
		if(start <= end){
			for(int i = start; i <= end; i++){
				res.reversedString += this.reversedString.charAt(i);
			}
		}
		return res;
	}

	public String toString(){
		return this.reversedString;
	}
}