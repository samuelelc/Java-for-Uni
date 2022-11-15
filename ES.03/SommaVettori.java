package it.community.unipa.prg03;
import java.lang.Math;

public class SommaVettori{
	public static void main(String[] args) {
		double array1[] = new double[10];
		double array2[] = new double[10];
		double ris[] = new double[10];
		for(int i = 0; i < 10; i++){
			array1[i] = Math.random() * 1000;
			array2[i] = Math.random() * 1000;
			ris[i] = array1[i] + array2[i];
			System.out.printf("%f + %f = %f\n", array1[i], array2[i], ris[i]);
		}
	}
}

/*
 * 1 8
 * 0 000.01010
 * 0x05000000
 */