package repl;

public class question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="catdogcatdog";
		
		int count=0;
		int count2=0;
		for (int i=0; i<str.length()-2; i++) {
			if (str.substring(i, i+3).equals("cat")) {count++;}
			else if (str.substring(i, i+3).equals("dog")) {count2++;}
			
			
			
			
		}
		 
		
		if (count==count2) {System.out.println("true");}

	}

}
