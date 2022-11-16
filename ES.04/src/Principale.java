package prg.es2;
import java.util.ArrayList;

public class Principale{
	public static void main(String[] args) {
		ArrayList<Persona> miaLista = new ArrayList<>();
		miaLista.add(new Persona());
		miaLista.add(new Persona());
		miaLista.add(new Persona());
		miaLista.get(0).nome = "Franco";
		miaLista.get(1).nome = "Giuseppe";
		miaLista.get(2).nome = "Carlo";

		System.out.println(miaLista.size());

		System.out.println(miaLista.get(0).nome);

		miaLista.remove(2);

		for(Persona p : miaLista){
			System.out.println(p.nome);
		}

		System.out.println("Prova2:");
		System.out.println(miaLista);

		miaLista.clear();
		System.out.println(miaLista.size());
	}
}