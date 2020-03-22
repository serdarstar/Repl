package Interview_Questions;

public class Odd_Even_08 {
    public static void main(String[] args) {
        /*
        Write  a method which can identifies given number is even or odd
         */

        int a=5;
        int b=6;
        System.out.println(odd_even(b));
        System.out.println(odd_even(a));
    }
    public static String odd_even(int x){
        String a="";

        if(x%2==0){
            a="even";
        } else {a="odd";}

        return a;

    }
}
