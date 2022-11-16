public class Rettangolo{
	public int l1;
	public int l2;

	public Rettangolo(int a, int b){
		l1 = a;
		l2 = b;
	}

	public int perimetro(){
		return l1*2+l2*2;
	}
	public int area(){
		return l1*l2;
	}
}