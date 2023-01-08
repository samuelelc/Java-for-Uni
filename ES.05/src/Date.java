package prg.es4;

import java.lang.IllegalArgumentException;

public class Date{
	private int day;
	private int month;
	private String sMonth;
	private int year;
	private final static String[] setMonth = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};

	//COSTRUTTORI:
	public Date(){}

	public Date(int day, int year){
		this.setDay(day);
		this.setYear(year);
	}

	public Date(int day, int month, int year){
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}

	public Date(int day, String month, int year){
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}

	//METODI:
	public Date setDay(int day){
		if(day > 0 && day <= 28){
			this.day = day;
		} else if(this.getMonth()==2 && this.getYear()%4==0 && day <= 29){	//mese di febbraio (controllo bisestile)
			this.day = day;
		} else if(this.getMonth() == 4 && this.getMonth() == 6  && this.getMonth() == 9  && this.getMonth() == 11 && day <= 30){	//mesi di 30 giorni 
			this.day = day;
		} else if (this.getMonth() == 1 && this.getMonth() == 3  && this.getMonth() == 5  && this.getMonth() == 7 && this.getMonth() == 8 && this.getMonth() == 10 && this.getMonth() == 12 && day <= 31) {	//mesi di 31 giorni
			this.day = day;
		}else if (this.getMonth() == 0 && day <= 31){	//Se il mese non è stato precedentemente inserito
			System.out.println("Errore. Impostare prima il mese. Verra' impostato il mese di Gennaio");
			this.setMonth(1);
			this.day = day;
		} else {
			throw new IllegalArgumentException("Giorno inserito non valido");
		}
		return this;
	}

	public Date setMonth(int month){
		switch (month) {
			case 1:
				this.sMonth = "Gennaio";
				this.month = month;
				break;

			case 2:
				this.sMonth = "Febbraio";
				this.month = month;
				break;
			case 3:
				this.sMonth = "Marzo";
				this.month = month;
				break;
			case 4:
				this.sMonth = "Aprile";
				this.month = month;
				break;
			case 5:
				this.sMonth = "Maggio";
				this.month = month;
				break;
			case 6:
				this.sMonth = "Giugno";
				this.month = month;
				break;
			case 7:
				this.sMonth = "Luglio";
				this.month = month;
				break;
			case 8:
				this.sMonth = "Agosto";
				this.month = month;
				break;
			case 9:
				this.sMonth = "Settembre";
				this.month = month;
				break;
			case 10:
				this.sMonth = "Ottobre";
				this.month = month;
				break;
			case 11:
				this.sMonth = "Novembre";
				this.month = month;
				break;
			case 12:
				this.sMonth = "Dicembre";
				this.month = month;
				break;
		
			default:
				throw new IllegalArgumentException("Mese inserito non valido");
		}
		return this;
	}

	public Date setMonth(String month){
		boolean check = false;
		for(int i = 0; i < 12; i++){
			if(setMonth[i]==month){
				check = true;
				this.month = ++i;
				this.sMonth = month;
			}
		}
		if(check == false){
			throw new IllegalArgumentException("Mese inserito non valido");
		}
		return this;
	}

	public Date setYear(int year){
		if(year < 2500){
			this.year = year;
		} else {
			throw new IllegalArgumentException("Anno inserito non valido");
		}
		return this;
	}

	public int getDay(){
		return this.day;
	}

	public int getMonth(){
		return this.month;
	}

	public int getYear(){
		return this.year;
	}

	public String getsMonth(){
		return this.sMonth;
	}

	public String toString1(){		//	GG AAAA
		return this.getDay() + " " + this.getYear();
	}

	public String toString2(){		//	GG/MM/AA
		return this.getDay() + "/" + this.getMonth() + "/" + (this.getYear()%100);
	}

	public String toString3(){		//	GG Month AAAA
		return this.getDay() + " " + this.getsMonth() + " " + this.getYear();
	}

	public Date toPrint1(){
		System.out.println(this.toString1());
		return this;
	}

	public Date toPrint2(){
		System.out.println(this.toString2());
		return this;
	}

	public Date toPrint3(){
		System.out.println(this.toString3());
		return this;
	}

	public boolean equals(Date date){
		if(this.getDay() == date.getDay() && this.getMonth() == date.getMonth() && this.getYear() == date.getYear()){
			return true;
		} else {
			return false;
		}
	}
}