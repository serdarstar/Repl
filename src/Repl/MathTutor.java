package repl;

import java.util.*;


public class MathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		int sum;
		int userAnswer;
		Scanner sc=new Scanner (System.in);
		Random rn=new Random();
		number1=rn.nextInt(100);
		number2=rn.nextInt(100);
		
		System.out.println("What is the answer?");
		System.out.println(number1+"+"+number2+"= ?");
		
		userAnswer=sc.nextInt();
		sum=number1+number2;
		if (userAnswer==sum) {System.out.println("Correct");}
		else {System.out.println("Sorry. Correct is "+sum);}

	}

}
