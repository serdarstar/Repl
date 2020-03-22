package repl;

import java.util.Scanner;

public class repl65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		    if (word.length()%2==1&&word.length()>5) {
		    	
		    	String str=word.substring((word.length()/2)-1, (word.length()/2)+2);
		    	System.out.println(str);}
		    else if(word.length()%2==0||word.length()<3) System.out.println("invalid");
    
		   
	}

}
