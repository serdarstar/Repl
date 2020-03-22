package Repl;

import java.util.Scanner;

public class repl_160 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean toBe=sc.nextBoolean();
        boolean notToBe=sc.nextBoolean();
        System.out.println(hamletQuote(toBe,notToBe));

    }

    public static boolean hamletQuote(boolean a, boolean b) {

        boolean result=false;
        if (a==true&&b==true) {
            result=true;
        }

        return result;

    }
}
