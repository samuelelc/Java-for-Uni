package prg.es4;

public class Date{
	private int day;
	private int month;
	private String sMonth;
	private int year;
	private static String[] setMonth = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};

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
			System.out.println("Dato inserito non valido! Verra' Impostato 1");
			this.day = 1;
		}
		return this;
	}

	public Date setMonth(int month){
		this.month = month;
		switch (month) {
			case 1:
				this.sMonth = "Gennaio";
				break;

			case 2:
				this.sMonth = "Febbraio";
				break;
			case 3:
				this.sMonth = "Marzo";
				break;
			case 4:
				this.sMonth = "Aprile";
				break;
			case 5:
				this.sMonth = "Maggio";
				break;
			case 6:
				this.sMonth = "Giugno";
				break;
			case 7:
				this.sMonth = "Luglio";
				break;
			case 8:
				this.sMonth = "Agosto";
				break;
			case 9:
				this.sMonth = "Settembre";
				break;
			case 10:
				this.sMonth = "Ottobre";
				break;
			case 11:
				this.sMonth = "Novembre";
				break;
			case 12:
				this.sMonth = "Dicembre";
				break;
		
			default:
				System.out.println("Dato non valido! Verra' impostato Gennaio.");
				this.month = 1;
				this.sMonth = "Gennaio";
				break;
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
			System.out.println("Dato non valido! Verra' impostato Gennaio");
			this.month = 1;
			this.sMonth = "Gennaio";
		}
		return this;
	}

	public Date setYear(int year){
		if(year < 2500){
			this.year = year;
		} else {
			System.out.println("Dato inserito non valido! Verra' Impostato 2022");
			this.year = 2022;
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