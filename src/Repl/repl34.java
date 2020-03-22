package repl;

import java.util.Scanner;

public class repl34 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter number of coupons:");
	    
	    int numberOfCoupons = scan.nextInt();
	    
	    int numberOfCandies; 
	    int numberOfGumballs;
	      
	    if(numberOfCoupons>10){
	      
	      numberOfCandies = numberOfCoupons/10;
	      numberOfCoupons = numberOfCoupons%10;
	      
	      System.out.println("Number of Candies: " + numberOfCandies);
	      
	    if(numberOfCoupons>=3){
	      
	      numberOfGumballs = numberOfCoupons/3;
	      numberOfCoupons = numberOfGumballs%3;
	     
	      System.out.println("Number of Gumballs: " + numberOfGumballs);
	      
	    }
	    }else if(numberOfCoupons>=3 && numberOfCoupons<10){
	      
	      numberOfGumballs = numberOfCoupons/3;
	      numberOfCoupons = numberOfGumballs%3;
	      
	      System.out.println("Number of Candies: 0");
	      System.out.println("Number of Gumballs: " + numberOfGumballs);
	      
	    }else if(numberOfCoupons<3){
	      
	      System.out.println("Not enough coupons");
	    }

	}

}
