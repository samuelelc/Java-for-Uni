import java.util.Scanner;
public class Moltiplica{
	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.println("Moltiplicatore");
		System.out.print("Inserire il primo numero: ");
		int input1 = keyboardScanner.nextInt();
		System.out.print("Inserisci il secondo numero: ");
		int input2 = keyboardScanner.nextInt();
		System.out.print("Risultato: ");
		System.out.print(input1*input2);

	}
}