package prg.es1;

public class TestDado{
	public static void main(String[] args) {
		Dado d = new Dado();
		int counter[] = new int[7];
		/*array che contiene il numero di volte che un numero è uscito: 
		 * es. al posto 1 quante volte è uscito il numero 1
		 * al posto 0 vengono contati i casi in cui esce un dato non previsto, 
		 * ovvero un numero non compreso tra 1 e 6
		 */

		int num;	
		int numeroTest = 200;
		for(int i = 0; i < numeroTest; i++){
			num = d.lancia();
			if(num>=1 && num <=6){
				counter[num]++;
			} else {
				counter[0]++;
			}
		}

		//STAMPA RISULTATI:
		for(int i = 1; i <= 6; i++){
			System.out.println("Numero "+i+ ": " + counter[i] + " casi");
		}
		System.out.println("Casi obsoleti: " + counter[0]);
	}
}