package prg.es1;

public class Dado extends Randomizzatore{
	public Dado(){}

	public int lancia(){
		int numVolte = (int) (Math.random() * 10.999);
		int num = (int) (Math.random()*5.999 + 1);
		int j = 1;
		do{
			for(int i = 1; i <= 6; i++){
				System.out.print(" ... " + i);
				if(i == num && j == numVolte){
					break;
				}
			}
			j++;
		}while(j<=numVolte);
		System.out.println();
		return num;
	}
}
