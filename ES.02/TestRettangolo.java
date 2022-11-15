public class TestRettangolo{
	public static void main(String[] args) {
		Rettangolo Rett1 = new Rettangolo(4, 5);
		Rettangolo Rett2 = new Rettangolo(3, 7);

		System.out.println("Il valore del perimetro del primo rettangolo e':" + Rett1.perimetro());
		System.out.println("Il valore dell'area del primo rettangolo e':" + Rett1.area());
		System.out.println("Il valore del perimetro del secondo rettangolo e':" + Rett2.perimetro());
		System.out.println("Il valore dell'area del secondo rettangolo e':" + Rett2.area());
	}
}