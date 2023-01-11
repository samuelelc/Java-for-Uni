package prg.esamiPassati.es4;

public class GiocatoreComputer extends Giocatore{
	public GiocatoreComputer(){}
	
	@Override
	public int[] gioca(){
		int[] coordinate = new int[2];
		coordinate[0] = (int)(Math.random() * 3.0 - 0.5);
		coordinate[1] = (int)(Math.random() * 3.0 - 0.5);
		return coordinate;
	}
}