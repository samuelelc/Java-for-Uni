package prg.es3;

public class Votante{
	private String phone;
	private int voteCounter;

	public Votante(String phone){
		this.setPhone(phone);
	}

	public Votante setPhone(String phoneNumber){
		this.phone = phoneNumber;
		return this;
	}

	public String getPhone(){
		return this.phone;
	}

	private Votante setVoteCounter(int number){		//private: non do la possibilità di settare voteCounter al di fuori di questa classe ma solo di incrementarlo
		this.voteCounter = number;
		return this;
	}

	public int getVoteCounter(){
		return voteCounter;
	}

	public Votante increaseVoteCounter(){
		if(this.getVoteCounter() < 5){
			this.setVoteCounter(this.getVoteCounter()+1);
		} else {
			System.out.println("Numero massimo di voti gia' raggiunto per " + this.getPhone());
		}
		return this;
	}

	public String toString(){
		return "Numero telefono: " + this.getPhone() + " Numero voti: " + this.getVoteCounter();
	}
}