package repl;

import java.util.Scanner;

public class repl72 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    char score='_';
	    char at='@';
	    String under="_";
	    
	    if (email.contains(under)) {
	    	
	    	int x=email.indexOf(score);
	    	int y=email.indexOf(at);
	    	String a=email.substring(0, x);
	    	String b=email.substring(x+1, y);
	    
	    	System.out.println(b.concat(under).concat(a).concat(email.substring(y)));
	    	
	    }else System.out.println(email);
	    

	}

}
