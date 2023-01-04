package prg.es09;

import prg.es07.Abbonato;
import prg.es07.AbbonatoPremium;
import java.util.ArrayList;

public class TestAbbonato2 {

	public static void main(String[] args){
	
		ArrayList<Abbonato> lista = new ArrayList<>();
		
		lista.add(new Abbonato("Nino", "Ficarra", 50));
		lista.add(new AbbonatoPremium("Edo", "Culoma", 25));
		
		System.out.println(lista);
	}
} 