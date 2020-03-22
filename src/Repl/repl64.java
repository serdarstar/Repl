package repl;

import java.util.Scanner;

public class repl64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ahme
		Scanner scan = new Scanner(System.in); 
	    String word = scan.next();
	    
	  
	    if(word.length()%2!=0){
	      if(word.length()>=3){
	        System.out.println(word.charAt((word.length()/2)));
	      }else if(word.length()==1){
	        System.out.println(word.concat(word).concat(word));
	      }
	    }else if(word.length()%2==0){
	      if(word.length()>=4){
	        System.out.println(""+ word.charAt((word.length()/2)-1) + (word.charAt(word.length()/2)));
	      }else if(word.length()==2){
	        System.out.println(word.concat(word));
	      }
	    }
	}
	
}
