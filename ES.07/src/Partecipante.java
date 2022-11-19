package prg.es3;

public class Partecipante{
	private String name;
	private int voteCounter;

	public Partecipante(String name){
		this.setName(name);
	}

	public Partecipante setName(String name){
		this.name = name;
		return this;
	}

	public String getName(){
		return this.name;
	}

	private Partecipante setVoteCounter(int number){
		this.voteCounter = number;
		return this;
	}

	public int getVoteCounter(){
		return this.voteCounter;
	}

	public Partecipante increaseVoteCounter(){
		this.setVoteCounter(this.getVoteCounter()+1);
		return this;
	}

	public String toString(){
		return "Nome concorrente: " + this.getName() + " Numero voti: " + this.getVoteCounter();
	}
}