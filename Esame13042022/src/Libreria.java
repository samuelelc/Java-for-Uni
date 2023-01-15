package prg.esame13042022;

import java.util.Sortedset;
import java.util.Scanner;

public class Libreria{
	Sortedset<Libro> libreria = new Sortedset<>();
	
	//no costruttori
	
	public Libreria addLibro(Libro newLibro){
		libreria.add(newLibro);
		return this;
	}
	
	public Libreria addLibro(String title, String author, int year){
		Libro newLibro = new Libro(title, author, year);
		this.addLibro(newLibro);
		return this;
	}
	
	public Libreria addLibro(){
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci titolo libro: ");
		String title = input.nextLine();
		System.out.print("Inserisci autore libro: ");
		String author=  input.nextLine();
		System.out.print("Inserisci anno di pubblicazione: ");
		return this.addLibro(title, author, input.nextInt());
	}
	
	public Libreria removeLibro(String title){
		Libro toBeDeleted = searchLibro(title);
		if(toBeDeleted != null){
			libreria.remove(toBeDeleted);
			System.out.println("Libro rimosso con successo");
		} else {
			System.out.println("Nessun libro dal titolo " + title + "e' presente nella libreria");
		}
		return this;
	}
	
	public Libro searchLibro(String title){
		for(Libro tmp : libreria){
			if(tmp.getTitle().equals(title)){
				return tmp;
			}
		}
		return null;
	}
	
	public String toString(){
		String res = "";
		if(libreria.isEmpty()){
			res = "Libreria vuota";
		} else {
			for(Libro tmp : libreria){
				res += tmp + "\n";
			}
		}
		return res;
	}
	
	public Libreria toPrint(){
		System.out.println(this);
		return this;
	}
}