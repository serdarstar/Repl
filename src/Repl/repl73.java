package repl;

import java.util.Scanner;

public class repl73 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
		char score='_';
	    char at='@';
	    String under="_";
	    char dot='.';
	    
	    if (email.contains(under)) {
	    	
	    	int x=email.indexOf(score);
	    	int y=email.indexOf(at);
	    	int z=email.indexOf(dot);
	    	String a=email.substring(0, x);
	    	String b=email.substring(x+1, y);
	    	String c=email.substring(y+1, z);
	    	String d=email.substring(z+1);
	    	
	    	String g= a.substring(0, 1).toUpperCase() + a.substring(1);
	    	String h=b.substring(0, 1).toUpperCase() + b.substring(1);
	    	 	
	    	
	    	System.out.println("First name: "+g);
	    	System.out.println("Last name: "+h);
	    	System.out.println("Domain: "+c);
	    	System.out.println("Top-level Domain: "+d);
	    	
	    
	    	
	    }else System.out.println(email);

	}

}
