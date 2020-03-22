package Assginment_3;

public class UpperBound_14 {
    /*
    Question-15:

Write a program to calculate the sum of the numbers from 1 till upper bound.
If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

You should use while loop.
     */
    public static void main(String[] args) {

//        int a=11;
//        int sum=0;
//        for (int i = 0; i <a+1; i++) {
//           sum+=i;
//
//        }
//        System.out.println(sum);

        int  i=0;
        int  b=11;

        int sum2=0;

        while(i<=b){

            sum2+=i;
            i++;
        }
        System.out.println(sum2);
    }
}
