package prg.es1;
import java.util.Scanner;

public class ScannerPro{
	private static ScannerPro instance;
	private Scanner scanner;
	private ScannerPro(){
		scanner = new Scanner(System.in);
	}

	public static ScannerPro getInstance(){
		if(instance == null){
			instance = new ScannerPro();
		}
		return instance; 
	}

	public String insertName(){
		System.out.print("Inserisci nome: ");
		return instance.scanner.next();
	}

	public String insertSurname(){
		System.out.print("Inserisci cognome: ");
		return instance.scanner.next();
	}

	public int insertEta(){
		System.out.print("Inserisci eta': ");
		return instance.scanner.nextInt();
	}

	public String insertString(String message){
		System.out.print(message);
		return instance.scanner.next();
	}

	public int insertInt(String message){
		System.out.print(message);
		return instance.scanner.nextInt();
	}
}