package Interview_Questions;

import java.util.Arrays;

public class Find_Minumum_06 {
    public static void main(String[] args) {
        int [] a={15,34,44,1};
        System.out.println(minimum(a));
        System.out.println(minimum2(a));
        System.out.println(minimum3(a));
    }
    public static int minimum(int[] array){

        int min=array[0];
        for (int i = 0; i < array.length-1; i++) {

             if(array[i+1]<min){
                 min=array[i+1];
             }
        }
        return min;
    }

    public static int minimum2(int [] arr){
        int min = Integer.MAX_VALUE;

        for(int each: arr)

            if(each < min){
                min = each;
            }

            return min;

    }

    public static int minimum3(int[] arr){
        Arrays.sort(arr);
        int min=arr[0];
        return min;
    }

}
