package prg.testEsame.es1;

public class Scultura extends OperaDArte{
	private String material;
	private int height;
	
	//costruttori
	public Scultura(String title, String author, String date, String material, int height){
		super(title, author, date);
		this.setMaterial(material).setHeight(height);
	}
	
	//metodi set
	
	public Scultura setMaterial(String material){
		this.material = material;
		return this;

	}
	
	public Scultura setHeight(int height){
		this.height = Math.abs(height);
		return this;
	}
	
	//metodi get
	
	public String getMaterial(){
		return this.material;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	//metodo toString
	
	public String toString(){
		return super.toString() + "MATERIALE: " + this.getMaterial() + "ALTEZZA: " + this.getHeight() + " cm";
	}
}