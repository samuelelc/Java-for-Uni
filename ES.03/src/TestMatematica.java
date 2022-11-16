public class TestMatematica{
	public static void main(String[] args) {
		Calcolatrice miaCalcolatrice = new Calcolatrice();
		double[] v1 = miaCalcolatrice.generaVettore(3);
		double[] v2 = miaCalcolatrice.generaVettore(3);
		double[] v3 = miaCalcolatrice.generaVettore(5);
		double[] ris1 = new double[3];
		double[] ris2 = new double[3];
		double[] ris3 = new double[8];

		ris1 = miaCalcolatrice.sommaVettori(v1, v2);
		ris2 = miaCalcolatrice.sommaVettori(v1, v3);
		ris3 = miaCalcolatrice.concatenaVettori(v1, v3);

		miaCalcolatrice.stampaVettore(ris1);
		miaCalcolatrice.stampaVettore(ris2);
		miaCalcolatrice.stampaVettore(ris3);

		double[][] m1 = miaCalcolatrice.generaMatrice(3,5);
		double[][] m2 = miaCalcolatrice.generaMatrice(3,5);
		double[][] m3 = miaCalcolatrice.generaMatrice(3,5);

		double[][] ris4, ris5 = new double[3][5];

		ris4 = miaCalcolatrice.sommaMatrici(m1, m2);
		ris5 = miaCalcolatrice.sommaMatrici(m1, m3);

		miaCalcolatrice.stampaMatrice(ris4);
		miaCalcolatrice.stampaMatrice(ris5);
	}
}