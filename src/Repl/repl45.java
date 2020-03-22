package repl;

import java.util.Scanner;

public class repl45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("in:");
	    String in = s.next();
	    String burg="burger";
	    String chick="chicken";
	    
	    if (in.equals(chick)||in.equals(burg)) {System.out.println("in="+in);
	    	System.out.println("output: 10.0");}else {System.out.println("in="+in);
	    	System.out.println("output: 2.0");}
	}

}
