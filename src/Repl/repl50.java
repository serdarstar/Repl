package repl;

import java.util.Scanner;

public class repl50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter command:");
		    char response = scan.next().charAt(0);
		   
		    String response1=""+response;
		    
		    
		    
		    
		  
		    
		    switch (response1) {
		    
		    case "y":System.out.println("input:"+response);
		    		System.out.println("Your request is being processed");
		    		break;
		    case "n":System.out.println("input:"+response);
    		System.out.println("Thank you anyway for your consideration");
    				break;
		    case "h":System.out.println("input:"+response);
    		System.out.println("Sorry, no help is currently available");
    				break;
		    default: System.out.println("Invalid entry, please try again!");	
    		
		    
		    }
		    
		    	    
			}	    
	

}
