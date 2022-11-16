public class TestDado{
	public static void main(String[] args) {
		Dado c1 = new Dado();
		Dado c2 = new Dado();
		int array[] = new int[6];		//array contatore, al posto 0 conta quante volte esce 1, al posto 1 quante volte esce 2, ecc...
		int n1, n2;
		for(int i = 0; i<10_000; i++){
			n1 = c1.lancia();
			n2 = c2.lancia();
			System.out.print(n1 + " " + n2);

			if(n1==1){
				array[0]++;
			} else if(n1==2){
				array[1]++;
			} else if(n1==3){
				array[2]++;
			} else if(n1==4){
				array[3]++;
			} else if(n1==5){
				array[4]++;
			} else if(n1==6){
				array[5]++;
			}

			if(n2==1){
				array[0]++;
			} else if(n2==2){
				array[1]++;
			} else if(n2==3){
				array[2]++;
			} else if(n2==4){
				array[3]++;
			} else if(n2==5){
				array[4]++;
			} else if(n2==6){
				array[5]++;
			}

			if(n1 == 1 && n2 == 2){
				System.out.print("  *");
			}
			System.out.println(" ");
		}

		System.out.println("Report casi:");
		for(int i = 0; i<6; i++){
			System.out.println(i+1 + ":	" + array[i] + " casi");
		}
	}
}