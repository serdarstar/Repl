package repl;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double average;
		Scanner sc  = new Scanner(System.in);
			
		String [] hours = new String[12];
		double [] rain=new double[12];
		
		System.out.println("Month Rainfall (in inches):");
		
				
			for(int i=0;i<11;i++) {
				hours[i] = sc.next();
				rain[i]=sc.nextDouble();
				System.out.println(hours[i]+":"+rain[i]);
				
				for(int p=0;p<=3;p++) {
					
					System.out.println(hours[i] + rain[i]);
		}
		
			}
	}

}
