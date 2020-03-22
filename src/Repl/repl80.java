package repl;

import java.util.Scanner;

public class repl80 {

	public static void main(String[] args) {
		int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();
	    
	    if (isPremiumCustomer) { 
	    	if (nbooksPurchased>=5&&nbooksPurchased<8) {
	    		 freeBooks=1;System.out.println(freeBooks);}
	    		
	    	}else if (nbooksPurchased>=8) {freeBooks=2;System.out.println(freeBooks);}
	    	else System.out.println("l");
//	    	
//	       	
//	    }else { if (nbooksPurchased>=7&&nbooksPurchased<12) {
//    		int freeBooks3=nbooksPurchased/7;System.out.println(freeBooks3);}
//		
//    	} if (nbooksPurchased>=12) {int freeBooks4=nbooksPurchased/12;System.out.println(freeBooks4);}
//	    

	    
//	    if (isPremiumCustomer==true) { 
//	    	if (nbooksPurchased>=5&&nbooksPurchased%5==0) {
//	    		int freeBooks1=nbooksPurchased/5;System.out.println(freeBooks1);}
//	    		
//	    	}else if (nbooksPurchased>8&&nbooksPurchased%8==0) {int freeBooks2=nbooksPurchased/8;System.out.println(freeBooks2);
//	    	
//	       	
//	    }else { if (nbooksPurchased>=7&&nbooksPurchased%7==0) {
//    		int freeBooks3=nbooksPurchased/7;System.out.println(freeBooks3);}
//		
//    	} if (nbooksPurchased>=12&&nbooksPurchased%12==0) {int freeBooks4=nbooksPurchased/12;System.out.println(freeBooks4);}
//	    

	}

}
