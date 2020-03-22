package repl;

import java.util.Scanner;

public class repl85 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String countinue = "";
			double price = 0;
			int count = 1;
			double totalPrice = 0;
		  
		  
		  do{
		    
	    System.out.println("Enter Item" + count + " and its price:");
	    item = scan.next();
	    price = scan.nextDouble();
	    totalPrice+=price;
	    System.out.println("Add one more item?");
	    countinue = scan.next();
	  
	      shoppingListReport=shoppingListReport +"Item"+count+": "+ item +   " " +"Price: " + price + ", " ;
	   

	      
	    count++;
	    if(count==11){
	      break;
	    }
	    
		  }while(countinue.equalsIgnoreCase("yes"));
	    
	    System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
	    System.out.println("Total price: "+totalPrice);
	    
	
	}

}
