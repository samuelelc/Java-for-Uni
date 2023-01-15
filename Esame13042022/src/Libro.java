package prg.esame13042022;

public class Libro{
	String title;
	String author;
	int year;
	
	public Libro(){
		this("Senza titolo", "Anonimo", 2022);
	}
	
	public Libro(String title, String author, int year){
		this.setTitle(title).setAuthor(author).setYear(year);
	}
	
	//metodi set
	//lancia eccezione quando assegni anno < 0 o > di 2022;
	public Libro setTitle(String title){
		this.title = title;
		return this;
	}
	
	public Libro setAuthor(String author){
		this.author = author;
		return this;
	}
	
	public Libro setYear(int year){
		if(year >= 0 && year <= 2022){
			this.year = year;
		} else {
			throw new IllegalArgumentException("Anno inserito non valido. Inserire anno compreso tra 0 e 2022 (estremi inclusi)");
		}
		return this;
	}
	
	//metodi get
	public String getTitle(){
		return this.title;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public int getYear(){
		return this.year;
	}
	
	//metodo toString
	public String toString(){
		return "TITOLO: " + this.getTitle() + "\tAUTORE: " + this.getAuthor() + "\tANNO: " + this.getYear();
	}
}