//Stampare in ordine inverso gli argomenti di args, solo quelli in posizione pari


public class ReversePrintArgs2{
	public static void main(String args[]){
		if(args.length % 2 == 0){
			for(int i = args.length - 1; i > 0; i-=2){
				System.out.println(args[i]);
			}
		} else {
			for(int i = args.length - 2; i > 0; i-=2){
				System.out.println(args[i]);
			}
		}
	}
}


/* PSEUDOCODICE 1

	if args.length % 2 = 0 then       0 0 0 0
		for i <- args.length - 1 to 1 (a due a due) do
			print args[i]
	else 
		for i <- args.length - 2 to 1 (a due a due) do
			print args[i]

	OPPURE 

   PSEUDOCODICE 2
	
	for i <- args.length - 1 to 1 do 
		if i % 2 = 1 then
			print args[i]

RITENGO MIGLIORE IL PRIMO ALGORITMO
*/