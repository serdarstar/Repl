package Interview_Questions;

public class fib {
    public static void main(String[] args) {
        int a=1;
        int b=2;

        for (int i = 0; i < 5; i++) {
            int sum=a+b;

            a=b;
            b=sum;
            System.out.print(sum+" ");

        }

    }

}
