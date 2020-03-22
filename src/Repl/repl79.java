package repl;

import java.util.Scanner;

public class repl79 {
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
    String txt = s.next();
    String x=txt.substring(0, txt.length()-1);
    System.out.println(x);
	}
}
