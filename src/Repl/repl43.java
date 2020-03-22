package repl;

import java.util.Scanner;

public class repl43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mid=new Scanner (System.in);
		int num1, num2, num3;
		System.out.println("Enter first number:");
		num1=mid.nextInt();
		System.out.println("Enter second number:");
		num2=mid.nextInt();
		System.out.println("Enter third number:");
		num3=mid.nextInt();
		if (num1>num2&&num1<num3) {System.out.println("Medium value is:"+num1);}
		else if (num2>num1&&num2<num3) {System.out.println("Medium value is:"+num2);}
		else {System.out.println("Medium value is:"+num3);}

	}

}
