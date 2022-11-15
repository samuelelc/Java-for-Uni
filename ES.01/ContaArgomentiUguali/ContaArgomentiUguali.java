public class ContaArgomentiUguali{
	public static void main(String args[]){
		int counter = 0;
		for(int i = 0; i < args.length; i++){
			if(args[i].equals("Ciao")){
				counter++;
			}
		}	
		System.out.print("Hai scritto ");
		System.out.print(counter);
		System.out.print(" volte l'argomento 'Ciao'");
	}
}