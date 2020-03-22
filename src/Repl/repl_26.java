package repl;
import java.util.Scanner;

public class repl_26 {

		public static void main(String[] args) {
			
			Scanner gr = new Scanner(System.in);
			
			System.out.println("Welcome to the Grader!");
			System.out.println("Please enter subject name number 1 and score for this subject");
			String name1=gr.next();
			double score1=gr.nextDouble();
			System.out.println("Please enter subject name number 1 and score for this subject");
			String name2=gr.next();
			double score2=gr.nextDouble();
			System.out.println("Please enter subject name number 1 and score for this subject");
			String name3=gr.next();
			double score3=gr.nextDouble();
			System.out.println("Please enter subject name number 1 and score for this subject");
			String name4=gr.next();
			double score4=gr.nextDouble();
			System.out.println("Please enter subject name number 1 and score for this subject");
			String name5=gr.next();
			double score5=gr.nextDouble();
			double average= (score1+score2+score3+score4+score5)/5;
			
			
			System.out.println("Summary: "+name1+" - "+ score1+", "+name2+" - "+ score2+", "+name3+" - "+ score3+", "+name4+" - "+ score4+", "+name5+" - "+ score5);
			System.out.println("Your average score is: "+ average);
			System.out.println("Thank you for using Grader!");
			System.out.println("Goodbye!");
			
		

	}

}
