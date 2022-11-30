package prg.es3;

public class TestVeicolo{
	public static void main(String[] args) {
		Ciclomotore vespa = new Ciclomotore(1.4, 2);
		Automobile auto = new Automobile(4, 2);
		Bicicletta bici = new Bicicletta(0.2, 0.1);

		//Set info
		vespa.setTelaio(347872432).setCilindrata(50);
		auto.setTarga("AA000AA").setCilindrata(1400);
		bici.setModello("BikeX");

		double t = 20;

		//nota: le velocità iniziali sono 0
		System.out.println("Dopo un tempo di: " + t + " secondi");
		vespa.muovi(t);
		auto.muovi(t);
		bici.muovi(t);
		System.out.println(vespa);
		System.out.println(auto);
		System.out.println(bici);
	}
}