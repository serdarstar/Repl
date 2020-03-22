package repl;

import java.util.Random;
import java.util.Scanner;

public class task83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner sc=new Scanner (System.in);
		Random rn=new Random();
		int number1 = 0, number2 = 0, count1 = 0, count2=0;
		
		for (int i=1;i<11; i++) {number1=rn.nextInt(6)+1;number2=rn.nextInt(6)+1;
		if (number1>number2) {count1++;}else if (number2>number1) {count2++;}
		else if(number1==number2) {System.out.println("no winner");
		
			
			
		}
		
		}
		
		System.out.println("computer:"+ number1);
		System.out.println(number2);
		
		
	}

}
