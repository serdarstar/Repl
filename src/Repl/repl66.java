package repl;

import java.util.Scanner;

public class repl66 {

	public static void main(String[] args) {
		
			  Scanner scan = new Scanner(System.in);
			 
			    String word1 = scan.next();
			    String word2 = scan.next();
			    int x=word1.length();
			    int y=word2.length();
			    
			    if (word1.length()!=3|| word2.length()!=3) {
			    	System.out.println("invalid");
			    } else if (word1.length()==3|| word2.length()==3) {
			    		String word3=word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+
			    		""+word1.charAt(2)+""+word2.charAt(2);
			    		System.out.println(word3);
			    	    }
	    	}

}
