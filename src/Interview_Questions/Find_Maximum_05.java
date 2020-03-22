package Interview_Questions;

import java.util.Arrays;

public class Find_Maximum_05 {
    public static void main(String[] args) {

     /*
    Write a method that can find the maximum number from an int Array
     */
        int[] a={10, 20, 30, 45,55};
        System.out.println(max(a));

    }


    public static int max(int [] arr){
        int max=0;

        for (int i = 0; i < arr.length-1; i++) {
           max=arr[i];
            if(arr[i+1]>max){
                 max=arr[i+1];
            }

        }

        return max;
    }

    public static int maxValue( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;



        return max;

    }
    public static int maxValue2( int[]  n ) {

        Arrays.sort( n );

        return  n [ n.length-1 ];

    }

}
