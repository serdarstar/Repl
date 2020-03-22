package Repl;

import java.util.Scanner;

public class repl_158 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        System.out.println(even(x));
    }
    public static boolean even(int a){
        if(a%2==0){
            return true;
        } else {

            return false;
        }


    }
}
