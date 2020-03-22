package repl;

import java.util.Scanner;

public class repl32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num, quarters, dimes, nickels;
		    //WRITE YOUR CODE HERE
		    
		    Scanner number = new Scanner(System.in);
		    
		    System.out.println("Enter your number:");
		    
		    num = number.nextInt();
		    
		    quarters = num/25;
		    num = num%25;
		    dimes = num/10;
		    num = num%10;
		    nickels = dimes%5;
		
		    if (num<25||num>=100) {System.out.println("Invalid Price");}else if (num%5==0){System.out.println("Invalid Price");}
		    else {
		    
		    System.out.println(quarters);
		    System.out.println(dimes);
		    System.out.println(nickels);}
		   

	}

}
