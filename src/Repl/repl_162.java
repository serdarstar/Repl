package Repl;

import java.util.Scanner;

public class repl_162 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        boolean c=sc.nextBoolean();
        System.out.println(threeLocks(a,b,c));
    }

    public static boolean threeLocks(boolean a,boolean b,boolean c) {

        boolean d=false;
        if ((a==true&&b==true)||c==true){
            d=true;
        }

        return d;

    }
}
