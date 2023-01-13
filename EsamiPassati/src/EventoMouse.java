package prg.esamiPassati.es6;

public class EventoMouse extends Evento{
	private int x;
	private int y;
	private int sxPressione;	//pressione tasto sinistro
	private int dxPressione;	//pressione tasto destro
	
	//costruttori 
	public EventoMouse(int id, String description, int x, int y, int sxPressione, int dxPressione){
		super(id, description);
		this.setX(x).setY(y).setSXPressione(sxPressione).setDXPressione(dxPressione);
	}
	
	//metodi set
	public EventoMouse setX(int x){
		this.x = x;
		return this;
	}
	
	public EventoMouse setY(int y){
		this.y = y;
		return this;
	}
	
	public EventoMouse setSXPressione(int sxPressione){
		this.sxPressione = sxPressione;
		return this;
	}
	
	public EventoMouse setDXPressione(int dxPressione){
		this.dxPressione = dxPressione;
		return this;
	}
	
	@Override
	public Evento setDescription(String description){
		super.setDescription(description + "(mouse)");
		return this;
	}
	
	//metodi get
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getSXPressione(){
		return this.sxPressione;
	}
	
	public int getDXPressione(){
		return this.dxPressione;
	}
	
	//toString
	public String toString(){
		return super.toString() + 
		"\tPOSIZIONE: (" + this.getX() + ", " + this.getY() + 
		")\tPRESSIONE TASTO SINISTRO: " + this.getSXPressione() +  
		"\tPRESSIONE TASTO DESTRO: " + this.getDXPressione();
	}
}