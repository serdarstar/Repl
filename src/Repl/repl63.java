package repl;

import java.util.Scanner;

public class repl63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    System.out.println(word1.concat(word2).concat(word2).concat(word1));
	}

}
