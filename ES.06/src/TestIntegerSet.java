package prg.es2_3;

public class TestIntegerSet{
	public static void main(String[] args) {
		IntegerSet a = new IntegerSet();
		IntegerSet b = new IntegerSet();
		IntegerSet c = new IntegerSet();

		//inserisco 12, 22, 80, 90, 91, 99
		a.insertElement(12).insertElement(22).insertElement(80).insertElement(90).insertElement(91).insertElement(99);
		
		//inserisco 12, 23, 31, 33, 80, 99
		b.insertElement(12).insertElement(23).insertElement(31).insertElement(33).insertElement(80).insertElement(99);

		b.insertElement(12); /*	inserisco un elemento già presente. Nell'implementazione con array non succederà nulla,
								mentre con ArrayList la funzione insertElement verificherà prima che l'elemento non era già 
								presente e nel caso stamperà un messaggio di errore
							*/

		//c lo lascio vuoto

		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());

		a.unionOfIntegerSet(b).toPrint();
		a.intersectionOfIntegerSet(b).toPrint();

		a.deleteElement(12).toPrint();

		
	}
}