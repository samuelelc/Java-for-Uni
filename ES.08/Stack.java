package prg.es1;

import java.util.ArrayList;

public class Stack{
	private ArrayList<String>  stackOfString = new ArrayList<>();

	public void push(String string){
		if (!this.isFull()) {
			stackOfString.add(0, string);	
		} else {
			System.out.println("Stack pieno");
		}
	}

	public String pop(){
		String res = stackOfString.get(0);
		stackOfString.remove(0);
		return res;
	}

	public boolean isEmpty(){
		if (stackOfString.isEmpty()) {
			return true;
		}
		return false;
	}

	public boolean isFull(){
		if(stackOfString.size()>=100){
			return true;
		}
		return false;
	}

	public int size(){
		return stackOfString.size();
	}

	public boolean equals(Stack stack2){
		/*if(this.size() == stack2.size()){
			for(int i = 0; i < dim; i++){
				if(!this.get(i).equals(stack2.get(i))){
					return false;
				}
			}
			return true;*/
		return this.stackOfString.equals(stack2.stackOfString);
		
	}

	public String toString(){
		String res = "Pila: ";
		if(this.isEmpty()){
			res += " - ";
		} else {
			for (String string : stackOfString) {
				res += "\n" + string;
			}
		}
		return res;
	}
}