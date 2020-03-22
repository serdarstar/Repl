package repl;

import java.util.Scanner;

public class repl44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("player= ");
		int player = s.nextInt();
		System.out.println("house= ");
	    int house = s.nextInt();
	
	    if (house+player>21) {System.out.println("output: bust");}
	    else if (house>player){System.out.println("player loss");}
	    else if (house==player){System.out.println("its a tie");}
	    else if (house<player){System.out.println("player wins");}
	}

}
