package repl;

public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc bcbc bc bc";
		int count=0;
		for (int i=0; i<str.length()-1; i++) {
			if (str.substring(i, i+2).equals("bc")) {count++;}
			
			
		}
		 System.out.println(count);
	}

}
