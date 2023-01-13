package prg.esamiPassati.es6;

public class EventoTastiera extends Evento{
	int tasto;
	int modificatore;
	
	//costruttori
	public EventoTastiera(int id, String description, int tasto, int modificatore){
		super(id, description);
		this.setTasto(tasto).setModificatore(modificatore);
	}
	
	//metodi set
	public EventoTastiera setTasto(int tasto){
		this.tasto = tasto;
		return this;
	}
	
	public EventoTastiera setModificatore(int modificatore){
		this.modificatore = modificatore;
		return this;
	}
	
	@Override
	public Evento setDescription(String description){
		super.setDescription(description + "(tastiera)");
		return this;
	}
	
	//metodi get
	public int getTasto(){
		return this.tasto;
	}
	
	public int getModificatore(){
		return this.modificatore;
	}
	
	//metodo toString
	public String toString(){
		return super.toString() + "\tTASTO: " + this.getTasto() + "\tMODIFICATORE: "+ this.getModificatore();
	}
}