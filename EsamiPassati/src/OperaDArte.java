package prg.testEsame.es1;

public class OperaDArte{
	private String title;
	private String author;
	private String date;
	
	//costruttori
	
	public OperaDArte(String title, String author, String date){
		this.setTitle(title).setAuthor(author).setDate(date);
	}
	
	//metodi set
	
	public OperaDArte setTitle(String title){
		this.title = title;
		return this;
	}
	
	
	public OperaDArte setAuthor(String author){
		this.author = author;
		return this;
	}
	
	
	public OperaDArte setDate(String date){
		this.date = date;
		return this;
	}
	
	//metodi get
	
	public String getTitle(){
		return this.title;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public String getDate(){
		return this.date;
	}
	
	//metodo toString
	
	public String toString(){
		return "TITOLO OPERA: " + this.getTitle() + "AUTORE: " + this.getAuthor() + "DATA REALIZZAZIONE: " + this.getDate();
	}
}