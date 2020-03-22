package Repl;

import java.util.Scanner;

public class repl30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clock=new Scanner (System.in);
		
		int inputSeconds, hours, minutes,minutes2, seconds;
		System.out.println("Enter seconds:");
		seconds=clock.nextInt();
		
		
		hours=seconds/3600;
		minutes=(seconds-(3600*hours))/60;
		seconds=seconds%60;
		
		
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
		
	
		//System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
		
		
		
		

	}

}
