package prg.es1;

public class Moneta extends Randomizzatore{
	public Moneta(){}
	
	public int lancia(){
		int esito = (int) (Math.random()*1.999); //C = 0; T = 1;
		int numVolte = (int) (Math.random() * 10.999);
		int i = 0;
		while(numVolte >= i){
			System.out.print(" T C");
			i++;
		}
		if(esito == 1){
			System.out.print(" T");
		}
		System.out.println();
		return esito;
	}
}