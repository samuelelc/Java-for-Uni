package prg.es4;

public class TestDate{
	public static void main(String[] args) {
		Date d1 = new Date(2, "Aprile", 2020);
		Date d2 = new Date(32, 4, 2020);		//i costruttori utilizzano i metodi set

		d1.toPrint1().toPrint2().toPrint3();	//i metodi print utilizzano anche i metodi string e get
		d2.toPrint1().toPrint2().toPrint3();

		System.out.println(d1.equals(d2));
	}
}