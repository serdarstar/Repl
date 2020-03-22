package repl;

import java.util.Scanner;

public class repl33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner citi=new Scanner (System.in);
		int seniorCitizens, nonSeniorCitizens, age;
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		int count1=citi.nextInt();
		int count2=citi.nextInt();
		System.out.println("What is new citizen's age?");
		age=citi.nextInt();
		if (age>66) {System.out.println("Senior Citizen");count2++;}else if (age<66) {System.out.println("Non-Senior Citizen");count1++;}
		System.out.println("New seniorCitizens count:"+count2);
		System.out.println("New nonseniorCitizens count:"+count1);

	}

}
