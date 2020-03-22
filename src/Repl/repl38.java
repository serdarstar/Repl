package repl;

import java.util.Scanner;

public class repl38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter age:");
	    int age = input.nextInt();
	    if (age<2) {System.out.println("ineligible");}
	    else if (age==2) {System.out.println(age+", toddler");}
	    else if (age>2 && age<=5) {System.out.println(age+", early childhood");}
	    else if (age>5 && age<=7) {System.out.println(age+", young reader");}
	    else if (age>7 && age<=10) {System.out.println(age+", elementary");}
	    else if (age>10&&age<=12) {System.out.println(age+", middle");}
	    else if (age==13) {System.out.println(age+", impossible");}
	    else if (age>13 && age<=16) {System.out.println(age+", high school");}
	    else if (age>16 && age<=18) {System.out.println(age+", scholar");}
	    else if (age>18) {System.out.println(age+", ineligible");}
	}

}
