public class TestQuadrato{
	public static void main(String[] args) {
		Quadrato x = new Quadrato(5);
		//x.lato = 5;
		System.out.println("Il valore del perimetro è:" + x.perimetro());
		System.out.println("Il valore dell'area è:" + x.area());
	}
}