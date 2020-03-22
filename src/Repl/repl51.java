package repl;

import java.util.Scanner;

public class repl51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	
	tipCalculator();
	}
	public static void tipCalculator() {
		double Total_to_pay = 0;
		double Total_Tip = 0;
		double Total_per_person;
		double Tip_per_person;
		Scanner sc = new Scanner(System.in);
		System.out.println("Split:");
		String split = sc.next();
		System.out.println("Number of people:");
		int numpeoberOfple = sc.nextInt();
		System.out.println("Check amount:");
		double Check_amount = sc.nextDouble();
		System.out.println("Service Quality:");
		String Service_Quality = sc.next();
		System.out.print("Number of people entered: ");
		for (int i = 1; i <= numpeoberOfple; i++) {
			System.out.print("&");
		}
		System.out.println("");
		switch (Service_Quality) {
		case "Excellent":
			Total_Tip = Check_amount * 0.25;
			break;
		case "Great":
			Total_Tip = Check_amount * 0.20;
			break;
		case "Good":
			Total_Tip = Check_amount * 0.15;
			break;
		case "Fair":
			Total_Tip = Check_amount * 0.10;
			break;
		case "Poor":
			Total_Tip = Check_amount * 0.05;
			break;
		}
		Total_to_pay = Total_Tip + Check_amount;
		System.out.println("Total to pay: " + Total_to_pay);
		System.out.println("Total tip: " + Total_Tip);
		Total_per_person = Total_to_pay / numpeoberOfple;
		System.out.println("Total per person: " + Total_per_person);
		Tip_per_person = Total_Tip / numpeoberOfple;
		System.out.println("Tip per person: " + Tip_per_person);
	
		
	
	
	}
}
