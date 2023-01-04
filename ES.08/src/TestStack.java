package prg.es1;

import prg.es1.Stack;

public class TestStack{
	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();

		//STATO 0
		System.out.println("STATO 0");
		System.out.println("\nStack1:");
		System.out.println(stack1.toString());
		System.out.println("Dimensione: " + stack1.size());
		System.out.println("E' vuota?: " + stack1.isEmpty());
		System.out.println("E' piena: " + stack1.isFull());

		System.out.println("\nStack2:");
		System.out.println(stack2.toString());
		System.out.println("Dimensione: " + stack2.size());
		System.out.println("E' vuota?: " + stack2.isEmpty());
		System.out.println("E' piena: " + stack2.isFull());

		System.out.println("\nSono uguali? " + stack1.equals(stack2));

		//Modifiche
		//aggiungo gli stessi elementi nei due stack
		//provo ad aggiungere 101 stringhe nello stack
		for(int i = 0; i < 101; i++){
			stack1.push("stringa di prova");
			stack2.push("stringa di prova");
		}

		//STATO 1
		System.out.println("STATO 1");
		System.out.println("\nStack1:");
		System.out.println(stack1.toString());
		System.out.println("Dimensione: " + stack1.size());
		System.out.println("E' vuota?: " + stack1.isEmpty());
		System.out.println("E' piena: " + stack1.isFull());

		System.out.println("\nStack2:");
		System.out.println(stack2.toString());
		System.out.println("Dimensione: " + stack2.size());
		System.out.println("E' vuota?: " + stack2.isEmpty());
		System.out.println("E' piena: " + stack2.isFull());

		System.out.println("\nSono uguali? " + stack1.equals(stack2));

		//Modifiche
		stack1.pop();
		stack1.push("stringa diversa");

		//STATO 2
		System.out.println("STATO 2");
		System.out.println("\nStack1:");
		System.out.println(stack1.toString());
		System.out.println("Dimensione: " + stack1.size());
		System.out.println("E' vuota?: " + stack1.isEmpty());
		System.out.println("E' piena: " + stack1.isFull());

		System.out.println("\nStack2:");
		System.out.println(stack2.toString());
		System.out.println("Dimensione: " + stack2.size());
		System.out.println("E' vuota?: " + stack2.isEmpty());
		System.out.println("E' piena: " + stack2.isFull());

		System.out.println("\nSono uguali? " + stack1.equals(stack2));
	}
}