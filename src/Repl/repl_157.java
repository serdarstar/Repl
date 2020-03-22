package Repl;

import java.util.Scanner;

public class repl_157 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int max=sc.nextInt();
        max(x,max);


    }

    public static void max(int a, int b) {
        if (a>b){
            System.out.println("x is bigger than max");
        }else System.out.println("\"max is bigger than x\";");

    }

}
