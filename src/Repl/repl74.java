package repl;

import java.util.Scanner;

public class repl74 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String message = scan.nextLine();
		    String sender;
		    String phoneNumber;
		    String messageBody;
		    int x=message.indexOf('<');
		    int y= message.indexOf('>');
		    sender=message.substring(x, y+1);
		    int a=message.indexOf('[');
		    int b= message.indexOf(']');
		    phoneNumber=message.substring(a, b+1);
		    int c=message.indexOf('{');
		    int d= message.indexOf('}');
		    messageBody=message.substring(c, d+1);
		    System.out.println("Sender:"+sender);
		    System.out.println("From Number:"+phoneNumber);
		    System.out.println("Message:"+messageBody);
		    
		    message="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		    
	}

}
