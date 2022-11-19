package prg.es1;

public class TestMoneta{
	public static void main(String[] args) {
		Moneta d = new Moneta();
		int counter[] = new int[3];
		int esito;
		/*conta: 
		 * in posizione 0 i casi in cui esce CROCE (C)
		 * in posizione 1 i casi in cui esce TESTA (T)
		 * in posizione 2 i casi obsoleti
		*/
		int numeroTest = 10000;
		for(int i = 0; i <numeroTest; i++){
			esito = d.lancia();
			if(esito == 0 || esito == 1){
				counter[esito]++;
			} else {
				counter[2]++;
			}
		}

		//STAMPA RISULTATI
		System.out.println("TESTA: " + counter[0] + " casi");		
		System.out.println("CROCE: " + counter[1] + " casi");
		System.out.println("CASI OBSOLETI: " + counter[2] + " casi");		
	}
}
