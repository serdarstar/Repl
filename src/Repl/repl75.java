package repl;

import java.util.Scanner;

public class repl75 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    char a='x';
		    char b='X';
		    
		  
		    if (word.charAt(0)==a&& word.charAt(word.length()-1)==a) {
		    	String word2= word.substring(1, word.length()-1);
		    		System.out.println(word2);
		    }else if (word.charAt(word.length()-1)==a||word.charAt(word.length()-1)==b) {
		    	String word2=word.substring(0, word.length()-1);
		    	System.out.println(word2);
		    }else if (word.charAt(0)==b&& word.charAt(word.length()-1)==a) {
		    	String word2= word.substring(1, word.length()-1);
	    		System.out.println(word2);
		    }else if (word.charAt(0)==a&& word.charAt(word.length()-1)==b) {
		    	String word2= word.substring(1, word.length()-1);
	    		System.out.println(word2);
		    }else if (word.charAt(0)==b&& word.charAt(word.length()-1)==b) {
		    	String word2= word.substring(2, word.length()-1);
	    		System.out.println(word2);
		    }else if (word.charAt(0)==a||word.charAt(0)==b) {
		    	String word2= word.substring(1,word.length());
	    		System.out.println(word2);
	    	}else if  (word.length()-1==a||word.length()-1==b) {
		    	String word2= word.substring(0, word.length());
	    		System.out.println(word2);
	     	}else System.out.println(word);
		}

}
