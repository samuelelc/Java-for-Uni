package prg.es1;

import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;
import java.lang.ArithmeticException;

public class VectorInteger implements Comparable<VectorInteger>{
	private ArrayList<Integer> vector;
	
	//COSTRUTTORI 
	
	public VectorInteger(){
		this(10);
	}
	
	public VectorInteger(int dim){
		vector = new ArrayList<>(dim);
		for(int i = 0; i < dim; i++){
			vector.add(0);
		}
	}
	
	//METODI GET
	public Integer get(int index){
		if(index < vector.size()){
			return vector.get(index);
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	//METODI SET
	
	public VectorInteger set(int index, Integer elem){
		if(index < this.size()){
			vector.set(index, elem);
		} else {
			throw new IndexOutOfBoundsException();
		}
		return this;
	}
	
	//OPERAZIONI
	//somma
	public VectorInteger sum(VectorInteger add){
		if(this.size() == add.size()){
			VectorInteger result = new VectorInteger(this.size());
			for(int i = 0; i < this.size(); i++){
				result.set(i, this.get(i) + add.get(i));
			}
			return result;
		} else {
			throw new ArithmeticException();
		}
	}
	
	//differenza
	public VectorInteger subtract(VectorInteger add){
		if(this.size() == add.size()){
			VectorInteger result = new VectorInteger(this.size());
			for(int i = 0; i < this.size(); i++){
				result.set(i, this.get(i) - add.get(i));
			}
			return result;
		} else {
			throw new ArithmeticException();
		}
	}
	
	//prodotto scalare
	public int dotProduct(VectorInteger other){
		if(this.size() == other.size()){
			int sum = 0;
			for(int i = 0; i < this.size(); i++){
				sum += this.get(i) * other.get(i);
			}
			return sum;
		} else {
			throw new ArithmeticException();
		}
	}
	
	//prodotto per scalare
	public VectorInteger multiplicationByScalar(int fatt){
		VectorInteger result = new VectorInteger(this.size());
		for(int i = 0; i < this.size(); i++){
			result.set(i, this.get(i) * fatt);
		}
		return result;
	}
	
	//modulo
	public double module(){
		int sumOfSquared = 0;
		for(Integer i : vector){
			sumOfSquared += Math.pow(i, 2);
		}
		return Math.sqrt(sumOfSquared);
	}
	
	//size
	public int size(){
		return vector.size();
	}
	
	//equals
	public boolean equals(Object other){
		if(this == other){
			return true;
		} else if(other instanceof VectorInteger){
			VectorInteger otherVector = (VectorInteger) other;
			return this.vector.equals(otherVector.vector);
		} else {
			return false;
		}
		
	}

	//hashCode
	public int hashCode(){
		int sum = 0;
		for(int i = 0 ; i < this.size(); i++){
			sum += Math.pow(-1, i) * this.get(i) * (i + 1);
		}
		return sum;	
	}

	//interfacicia Comparable<VectorInteger>
	//compareTo -> in base al confronto dei moduli
	public int compareTo(VectorInteger other){
		if(this.equals(other)){
			return 0;
		} else if (this.module() > other.module()){
			return 1;
		} else {
			return -1;
		}
	}
	
	//toString
	public String toString(){
		String st = "[ ";
		for(Integer i : this.vector){
			st += i + " ";
		}
		st += "]";
		return st;
	}
	
	//toPrint
	public VectorInteger toPrint(){
		System.out.println(this.toString());
		return this;
	}
	
}