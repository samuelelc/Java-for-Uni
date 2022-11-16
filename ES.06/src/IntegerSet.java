/*	Samuele Lo Cascio
 * 	ESERCITAZIONE 6
 * 	es2-es3
*/
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

	public IntegerSet insertElement(int element){
		if(checkElement(element)){	//verifica se l'elemento è già presente
			this.set.add(Integer.valueOf(element));
		} else {
			System.out.println("Elemento gia' presente");
		}
		return this;
	}

	public IntegerSet deleteElement(int element){
		this.set.remove(Integer.valueOf(element));
		return this;
	}

	public boolean checkElement(int element){
		for (Integer tmp : this.set) {
			if(tmp.intValue() == element){
				return true;
			}
		}
		return false;
	}

	public IntegerSet unionOfIntegerSet(IntegerSet otherSet){		
		IntegerSet union = new IntegerSet();
		for(Integer n : this.set){
			union.insertElement(n);
		}
		for(Integer m : otherSet.set){
			union.insertElement(m);		//nota: se l'elemento è già presente la funzione insertElement non lo inserisce (vedi insertElement r.63)
		}
		return union;
	}

	public IntegerSet intersectionOfIntegerSet(IntegerSet otherSet){
		IntegerSet intersection = new IntegerSet();
		for (Integer n : this.set) {
			if(otherSet.checkElement(n)){
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