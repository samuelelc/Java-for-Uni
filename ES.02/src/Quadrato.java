public class Quadrato{
	public int lato;
	public Quadrato(int l){
		lato = l;
	}
	public int perimetro(){
		return lato * 4;
	}

	public int area(){
		return lato * lato;
	}
}