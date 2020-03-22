package repl;

import java.util.Scanner;

public class repl46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int num, digit1, digit2, digit3, digit4, digit5;
		num=sc.nextInt();
		
		digit1=num%10;
		digit2=(num-10)%10;

		
		System.out.println(digit1);
		System.out.println(digit2);
	}

}
