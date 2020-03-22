package repl;

import java.util.Scanner;

public class repl52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number:");
				int x = scan.nextInt();
				int y;
				int z=-x;
				
			y=x>=5?x:x<5?z:x;
			System.out.println(y);
				

	}

}
