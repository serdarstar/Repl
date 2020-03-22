package repl;

import java.util.Arrays;

public class repl_200 {

	public static void main(String[] args) {
		
		  
		  int[] arr={1,2,3,4};
		  System.out.println(Arrays.toString(do_switch(arr)));
		  
	}
		  
		public static int[] do_switch(int[] i) {
		
		 int a=i[0];
		 int b=i[i.length-1];
		 
		  
		 i[0]=b;
		 i[i.length-1]=a;
		  
		  
		return i;

			
		

	}

}
