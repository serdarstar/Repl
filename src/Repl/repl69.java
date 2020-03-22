package repl;

import java.util.Scanner;

public class repl69 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		   
		    String word4=word.substring(0, word.length()/2);
		    String word5=word4.concat(word4);
		    System.out.println(word5);
	}

}
