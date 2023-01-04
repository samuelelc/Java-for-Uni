package prg.es3;

import java.util.*;

public class SplitText{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] parole = input.nextLine().split(" ");
		Map<String,Integer> wordFrequency = new TreeMap<>();
		System.out.println("Numero di parole: " + parole.length);
		for(String word : parole){
			int fr = 1;
			if(wordFrequency.containsKey(word)){
				fr = wordFrequency.get(word) + 1;
			}
			wordFrequency.put(word, fr);
		}
		System.out.print(wordFrequency);
	}
}