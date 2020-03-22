package repl;

import java.util.Scanner;

public class repl53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number1:");
				int num1 = scan.nextInt();
				System.out.println("Enter number2:");
				int num2 = scan.nextInt();
		
				int value;
		
	value=num1>num2?num1:num2;
	System.out.println(value);
		

	}

}
