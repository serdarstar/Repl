package Interview_Questions;

public class Swap_Numbers_13 {
    public static void main(String[] args) {

        /*
        Swap two variable' values without using a third variable
         */

        int a=10;
        int b=20;

        swap(a, b);

    }

    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);

    }
}
