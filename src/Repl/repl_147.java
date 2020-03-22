package Repl;

import java.util.Scanner;

public class repl_147 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {
            arr[i]=inp.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            isPos(arr[i]);
        }

    }

    public static void isPos(int arr) {


            if(arr>0){
                System.out.println("positive");
            } else System.out.println("not positive");



    }
}
