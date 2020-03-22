package repl;

import java.util.Scanner;

public class repl67 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
	    String word1 = scan.next();
	    int x=word1.length();
	  
	    if (x<5) {
	    	System.out.println("Too short");
	    }else if (x>5) {
	    	System.out.println("Too long");
	    }else if (x==5) {
	    	 
	    	String word2=word1.charAt(4)+""+word1.charAt(3)+""+word1.charAt(2)+""+word1.charAt(1)+
		    		""+word1.charAt(0);
	    	System.out.println(word2);
	    }
	  
	    	    
	}

}
