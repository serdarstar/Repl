package repl;

import java.util.Scanner;

public class repl57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		String a="Max Payne";
		String b="Alan Wake";
		System.out.println("Enter full name:");
		String FullName=sc.nextLine();
		if (FullName.equalsIgnoreCase(a)||FullName.equalsIgnoreCase(b)) {System.out.println("User found!");}else {System.out.println("User not found!");}
		

	}

}
