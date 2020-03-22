package repl;

import java.util.Scanner;

public class repl62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	  
		  String word = scan.nextLine();
		    
		    //WRITE YOUR CODE HERE
		    boolean exist = word.contains("good");
			System.out.println("Contains good: " + exist);
			
		String word2=scan.next();
		String a=word2.substring(0,1);
		String b=word2.substring(word2.length()-1);
		
	
		System.out.println(a.concat(b));

	}

}
