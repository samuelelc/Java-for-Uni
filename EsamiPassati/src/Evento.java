package prg.esamiPassati.es6;

public abstract class Evento implements Comparable<Evento>{
	private int id;
	private String description;
	
	//costruttori
	public Evento(int id, String description){
		this.setId(id).setDescription(description);
	}
	
	//metodi set
	public Evento setId(int id){
		this.id = id;
		return this;
	}

	public Evento setDescription(String description){
		this.description = description;
		return this;
	}
	
	//metodi get
	public int getId(){
		return this.id;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	//compareTo
	public int compareTo(Evento other){
		if(this.getId() < other.getId()){
			return -1;
		} else {
			return 1;
		}
	}
	
	//toString
	public String toString(){
		return "ID: " + this.getId() + "\tDESCRIZIONE: " + this.getDescription();
	}
}