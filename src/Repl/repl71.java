package repl;

import java.util.Scanner;

public class repl71 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = "alejandro";
	    String word2="project";
	    String a = scan.nextLine();
	    
	    if (a.contains(word)&&a.contains(word2)) {
	    	System.out.println("read this mail");
	    	
	    }else System.out.println("dont read");
	   

	}

}
