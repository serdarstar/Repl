package repl;

import java.util.Scanner;

public class repl61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    
		     if (word1.length()>word2.length()) {System.out.println(word1);}else System.out.println(word2);
	}

}
