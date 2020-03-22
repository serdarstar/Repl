package Interview_Questions;

public class Divide_without_operator_09 {
    public static void main(String[] args) {
        /*
        Write a method that can divide two numbers without using division operator
         */

        int a=11;
        int b=3;
        System.out.println(divide(a, b));



    }
    public static int divide(int a, int b){

        if (b==0){
            System.out.println("Invalid integer");
        }
            int counter=0;
            while (a>=b){
                a-=b;
                counter++;
            }
      return counter;
    }

}
