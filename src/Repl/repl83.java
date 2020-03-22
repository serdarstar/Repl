package repl;

import java.util.Scanner;

public class repl83 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter guest name:");
		String g1=input.next();
		System.out.println("Do you want to enter new guest name:");
		String newguest=input.next();
		if (newguest=="yes") {System.out.println("Please enter guest name:");}
		
	}

}
