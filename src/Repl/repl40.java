package repl;

import java.util.Scanner;

public class repl40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		    
		    System.out.println("what is the farthest planet in the solar system:" );
		    System.out.println("a)venus" );
		    System.out.println("b)pluto" );
		    System.out.println("c)neptune" );
		    
		    String a = s.nextLine();
		    String b="b";
		    String ab="a";
		    String c="c";
		    if (a.equals(b)) {System.out.println("b is correct");} 
		    else if (a.equals(c)) {System.out.println("c is not correct");}
		    else if (a.equals(ab)) {System.out.println("a is not correct");}
		    else {System.out.println(a.concat(" is not valid"));};
	}

}
