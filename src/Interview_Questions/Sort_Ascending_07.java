package Interview_Questions;

import java.util.Arrays;

public class Sort_Ascending_07 {
    public static void main(String[] args) {
        /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
     */

        int [] a={2,5,6,99};
        asc(a);

    }
    public static int[] asc(int[] a){

        int min=a[0];
        for (int i = 0; i < a.length-1; i++) {
            if (a[i+1]<min){
                min=a[i+1];
            }
        }
        int[] b=new int[a.length];

        for (int i = 0; i < b.length-1; i++) {
            b[0]=min;
            if(a[i+1]>min){
                b[i+1]+=a[i+1];

            }
        }
        System.out.println(Arrays.toString(b));
        System.out.println(min);

        return b;
    }
}
