public class SommaMatrici{
	public static void main(String[] args) {
		double Mat1[][] = new double[3][5];
		double Mat2[][] = new double[3][5];
		double ris [][] = new double[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				Mat1[i][j] = Math.random() * 100;
				Mat2[i][j] = Math.random() * 100;
				ris[i][j] = Mat1[i][j] + Mat2[i][j];
				System.out.printf("%.0f + %.0f = %.0f\t", Mat1[i][j], Mat2[i][j], ris[i][j]);
			}
			System.out.println("");
		}
	}
}