package repl;

import java.util.Scanner;

public class repl48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    int n1 = s.nextInt();
	    int n2 = s.nextInt();
	    int n3 = s.nextInt();
	    if (n1>n2&&n1>n3)System.out.println("n1 is bigger");
	    else if (n2>n1&&n2>n3)System.out.println("n2 is bigger");
	    else if (n3>n1&&n3>n2)
	    System.out.println( "n3 is bigger");
	    

	}

}
