package repl;

import java.util.Arrays;

public class lab3 {

	public static void main(String[] args) {
		
	
		int [] arr= {1,2,3,11,5,4};
		
		System.out.println(maxValue(arr));
		
		}
		
		public static int maxValue( int[]  n ) {

			Arrays.sort( n );
			System.out.println(Arrays.toString(n));
			return  n [ n.length-1 ];

			}

	
}
