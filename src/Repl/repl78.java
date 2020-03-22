package repl;

import java.util.Scanner;

public class repl78 {

	public static void main(String[] args) {
		
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		int zipcode=0;
		int age=0;
		int experience=0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		String accident="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		
		System.out.println("Enter your name:");
		name=scan.nextLine();
		System.out.println(name);
		
		System.out.println("Do you have a US driver license?");
		boolean driver=scan.nextBoolean();
		System.out.println(driver);
		
		if (driver) {
			System.out.println("Please provide your zipcode:");
			zipcode=scan.nextInt();
								
			if (zipcode==20910||zipcode==20740) {
				premium=premium+60;					
				
			}
			else if (zipcode==22102||zipcode==22103) {
				premium=premium+30;
					
			}
			else {
				premium=premium+50;

			}
			
				
			System.out.println("Is this car Owned, Financed or Leased?");
			vehicleOwnership=scan.next();
			
			if (vehicleOwnership.equalsIgnoreCase("Owned")) {
				premium=premium+10;
			} else if (vehicleOwnership.equalsIgnoreCase("Financed")||vehicleOwnership.equalsIgnoreCase("Leased")) {
				premium=premium+20;
			}				
			
			
				
			System.out.println("How is this vehicle primarily used?");
			vehicleUsage=scan.next();
			if (vehicleUsage.equalsIgnoreCase("Business")) {
				premium=premium+50;
					
			}else if(vehicleUsage.equalsIgnoreCase("Leisure")) {
				premium=premium+10;
					
			}else if(vehicleUsage.equalsIgnoreCase("Commute")) {
				premium=premium+20;
			}
		
			System.out.println("Do you go to work or school by car?");
			boolean byCar=scan.nextBoolean();
			System.out.println("Days Driven To Work And/Or School ");
			daysDrivenToWorkOrSchool =scan.nextInt();
			
			
			if (byCar==true) {
				for (int day=1; day<=daysDrivenToWorkOrSchool;day++) {
					premium=premium+5;
				}
			}
				System.out.println(daysDrivenToWorkOrSchool);
			
			
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
				
			for (int mile=0;mile<=milesToWorkOrSchool;mile++) {
				premium=premium+1;
			}
			System.out.println(daysDrivenToWorkOrSchool);
				
			System.out.println("How old are you?");
			age=scan.nextInt();
				
			if (age<16) {
				System.out.println("Invalid data");
				System.exit(0);
				
			}else if (age>16&&age<18) {
				premium=premium*20;
				
			}else if (age>=18&&age<=18) {
				premium=premium*6;
					
			}else if (age>21&&age<25) {
				premium=premium*2;
			}
			System.out.println(age);
				
				
			System.out.println("Experince?");
			experience=scan.nextInt();
				
			if (experience!=0&&(age-experience)>=16) {
				for (int i=0;i<=experience;i++) {
					premium=premium-5;
				}
			}else {
				System.out.println("Invalid data");
				System.exit(0);
			}
			System.out.println(experience);
				
			System.out.println("Have you had any accidents in the last 5 years?");
			accident=scan.next();
			if (accident.equalsIgnoreCase("Yes")) {
				int numberAcc=0;
				System.out.println("How many?");
				numberAcc=scan.nextInt();
				for (int i=0;i<=numberAcc;i++) {
					premium=premium+(premium*0.20);
				}
			}
			System.out.println(accident);
				
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance=scan.next();
			if (continuousInsurance.equalsIgnoreCase("no")) {
				premium=premium*2;
			}
			System.out.println(continuousInsurance);
				
			System.out.println("What is the highest level of education you have completed?");
			scan.nextLine();
			education=scan.nextLine();
			if(education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Master")) {
				premium=premium-(premium*0.15);
					
			}else if (education.equalsIgnoreCase("Bachelors")) {
				premium=premium-(premium*0.10);
										
			}else if (education.equalsIgnoreCase("Less than High School")) {
				premium=premium+(premium*0.05);
			}
			System.out.println(education);
				
							
		} else {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		System.out.println(name+"here's your quote!");
		System.out.println("Start Your Policy Today For:"+premium);
		String age1=age+"";
		String zip2=zipcode+"";
		String education2=education.replace(" ","");
		referenceNumber = "".concat(name.substring(0, 2)).concat(age1).concat(zip2).concat(education2);
		System.out.println("Reference number: "+referenceNumber);
				
	}

}
