public class Calcolatrice{
	public double[] generaVettore(int L){
		double[] vett = new double[L];
		for (int i = 0; i < L; i++) {
			vett[i] = Math.random() * 1000;
		}
		return vett;
	}

	public double[] sommaVettori(double[] a, double[] b){
		if (a.length == b.length) {
			double[] sum = new double[a.length];
			for (int i = 0; i < a.length; i++) {
				sum[i] = a[i] + b[i];
			}
			return sum;
		}else{
			return a;
		}
	}

	public double[] concatenaVettori(double[] a, double[] b){
		double[] c = new double[a.length + b.length];
		for(int i = 0; i < a.length; i++){
			c[i] = a[i];
		}
		for(int i = 0; i < b.length; i++){
			c[i+a.length] = b[i]; 
		}
		return c;
	}

	public void stampaVettore(double[] a){
		for(int i = 0; i < a.length; i++){
			System.out.printf("%f\t", a[i]);
		}
		System.out.println("");
	}

	public double[][] generaMatrice(int R, int C){
		double[][] mat = new double[R][C];
		for(int i = 0; i < R; i++){
			for(int j = 0; j < C; j++){
				mat[i][j] = Math.random() * 100;
			}
		}
		return mat;
	}

	public double[][] sommaMatrici(double[][] a, double[][] b){
		if(a.length == b.length && a[0].length == b[0].length){
			double[][] c = new double[a.length][a[0].length];
			for(int i = 0; i < a.length; i++){
				for(int j = 0; j < a[0].length; j++){
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			return c;
		} 
		return null;
	}

	public void stampaMatrice(double[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				System.out.printf("%f\t", m[i][j]);
			}
			System.out.println("");
		}
	}
}