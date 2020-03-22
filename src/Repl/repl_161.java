package Repl;

import java.util.Scanner;

public class repl_161 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double usage=scanner.nextDouble();

        System.out.println(bill(usage));


    }

    public static double bill(double args) {

        if(args<=50) {
            args=args*0.60;
        }else if(args>100&&args<=100) {
            args=(args*0.90)+50;
        } else if (args>100){
            args=(args*0.90)+100;

        }

        return args;

    }

}
