package prg.es1_3;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgrammaInterattivo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa;
        //String paroleVietate[] = {"alfa", "beta", "gamma", "delta", "epsilon", "kappa", "lambda", "sigma", "omega"};
		ArrayList<String> paroleVietate = new ArrayList<>();
		paroleVietate.add("alfa");		
		paroleVietate.add("beta");
		paroleVietate.add("gamma");
		paroleVietate.add("delta");
		paroleVietate.add("epsilon");
		paroleVietate.add("kappa");
		paroleVietate.add("lambda");
		paroleVietate.add("sigma");
		paroleVietate.add("omega");

        System.out.println("Digita qualcosa e batti enter, oppure " + "scrivi \"fine\" per terminare il programma");
        while(!(stringa = scanner.next()).equals("fine")) {
            /*boolean state = false;
            for (String tmp : paroleVietate) {
                if (tmp.equals(stringa)) {
                    state = true;
                }
            }
			
            if (state == false) {
                System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
            }*/
			if(!(paroleVietate.contains(stringa))){
				System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
			}
        }   
        System.out.println("Fine programma!");
    }
}