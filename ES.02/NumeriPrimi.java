import java.util.Scanner;

public class NumeriPrimi{
	public static void main(String[] args) {
		Scanner keyinput = new Scanner(System.in);
		int a;
		System.out.print("Inserisci numero: ");
		a = keyinput.nextInt();
		System.out.printf("1\n2\n");
		for (int i = 3;i<=a; i++) {
			boolean contr = true;
			for (int j =2; j<i; j++) {
				if (i%j==0) {
					contr = false;
					break;
				}
			}
			if(contr == true){
				System.out.println(i);
			}
		}
	}
}