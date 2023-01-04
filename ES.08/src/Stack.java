package prg.es1;

import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.util.EmptyStackException;

public class Stack<E>{
	private ArrayList<E>  stackOfString = new ArrayList<>();

	public void push(E element){
		if (!this.isFull()) {
			stackOfString.add(0, element);	
		} else {
			throw new IllegalArgumentException("StackPieno");
		}
	}

	public E pop(){
		if(!isEmpty()){
			return stackOfString.remove(0);
		} else {
			throw new EmptyStackException();
		}

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
			for (E element : stackOfString) {
				res += "\n" + element;
			}
		}
		return res;
	}
}