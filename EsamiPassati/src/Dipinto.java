package prg.testEsame.es1;

public class Dipinto extends OperaDArte{
	private String tecnica;
	private String[] tecnicheDisponibili = {"Olio", "Tempera", "Litografia", "Serigrafia", "China"};
	private int[] size = new int[2];
	
	//costruttori
	public Dipinto(String title, String author, String date, String tecnica, int size1, int size2){
		super(title, author, date);
		this.setTecnica(tecnica).setSize(size1, size2);
	}
	
	//metodi set
	
	public Dipinto setTecnica(String tecnica){
		for(String tec : tecnicheDisponibili){
			if(tec.equals(tecnica)){
				this.tecnica = tecnica;
				return this;
			}
		}
		System.out.println("Tecnica non valida!");
		return this;
	}
	
	public Dipinto setSize(int size1, int size2){
		this.size[0] = Math.abs(size1);
		this.size[1] = Math.abs(size2);
		return this;
	}
	
	//metodi get
	public String getTecnica(){
		return this.tecnica;
	}
	
	public String getSize(){
		return this.size[0] + "x" + this.size[1];
	}
	//metodo toString
	public String toString(){
		return super.toString() + "TECNICA: " + this.getTecnica() + "DIMENSIONI: " + this.getSize();
	}
}