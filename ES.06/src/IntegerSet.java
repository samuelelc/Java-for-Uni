package prg.es2_3;

import java.util.ArrayList;

public class IntegerSet{
	/*private boolean[] set;

	//COSTRUTTORI:
	public IntegerSet(){
		set = new boolean[100];
	}

	//METODI:
	public IntegerSet insertElement(int n){
		set[n] = true;
		return this;
	}

	public IntegerSet deleteElement(int n){
		set[n] = false;
		return this;
	}

	public IntegerSet unionOfIntegerSet(IntegerSet intSet){
		IntegerSet union = new IntegerSet();
		for(int i = 0; i < 100; i++){
			union.set[i] = this.set[i] || intSet.set[i];
		}
		return union;
	}

	public IntegerSet intersectionOfIntegerSet(IntegerSet intSet){
		IntegerSet intersection = new IntegerSet();
		for(int i = 0; i <100; i++){
			intersection.set[i] = this.set[i] && intSet.set[i];
		}
		return intersection;
	}

	public String toString(){
		String stringSet = "{ ";
		boolean check = false;
		for(int i = 0; i < 100; i++){
			if (this.set[i]==true) {
				stringSet += i + " ";
				check = true;
			}
		}
		stringSet += "}";
		if (check == false) {
			stringSet = " - ";
		}
		return stringSet;
	}

	public IntegerSet toPrint(){
		System.out.println(this.toString());
		return this;
	}*/

	private ArrayList<Integer> set = new ArrayList<>();

	public IntegerSet insertElement(int n){
		//verifica se l'elemento è già presente
		for (Integer tmp : this.set) {
			if (tmp.intValue() == n) {
				System.out.println("Elemento gia' presente");
				return this;
			}			
		}
		this.set.add(Integer.valueOf(n));
		return this;
	}

	public IntegerSet deleteElement(int n){
		this.set.remove(Integer.valueOf(n));
		return this;
	}

	public boolean checkElement(int n){
		for (Integer tmp : this.set) {
			if(tmp.intValue() == n){
				return true;
			}
		}
		return false;
	}

	public IntegerSet unionOfIntegerSet(IntegerSet intSet){		
		IntegerSet union = new IntegerSet();
		for(Integer n : this.set){
			union.insertElement(n);
		}
		for(Integer m : intSet.set){
			union.insertElement(m);		//nota: se l'elemento è già presente la funzione insertElement non lo inserisce (vedi insertElement r.63)
		}
		return union;
	}

	public IntegerSet intersectionOfIntegerSet(IntegerSet intSet){
		IntegerSet intersection = new IntegerSet();
		for (Integer n : this.set) {
			if(intSet.checkElement(n)){
				intersection.insertElement(n);
			}
		}
		return intersection;
	}

	public String toString(){
		if(this.set.size() == 0){
			return " - ";
		}
		String stringSet = "{ ";
		for (Integer tmp : this.set) {
			stringSet += tmp.intValue() + " ";
		}
		stringSet += "}";
		return stringSet;
	}	

	public IntegerSet toPrint(){
		System.out.println(this.toString());
		return this;
	}
}