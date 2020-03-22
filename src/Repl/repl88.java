package Repl;

import java.util.Scanner;

public class repl88 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    char start = scan.next().charAt(0);
		    char end = scan.next().charAt(0);
	        
		    char c;
	        for( c = start; c <= end; ++c) {
	            System.out.print(c + " ");
	            
	       }
		   
	}

}
