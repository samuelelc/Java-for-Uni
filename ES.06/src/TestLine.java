package prg.es5;

public class TestLine{
	public static void main(String[] args) {
		Line l1 = new Line(2, 3, 5, 0);
		Line l2 = new Line(0, 0, 5, 5);

		l1.toPrint();
		l2.toPrint();
	}
}