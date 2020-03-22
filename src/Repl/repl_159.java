package Repl;

import java.util.Scanner;

public class repl_159 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int buy=sc.nextInt();
        int sell=sc.nextInt();
        System.out.println(c_profits(buy,sell));

    }

    public static String c_profits(int a, int b) {
        String result="";
        if (a<b){
            result= "profit";
        }else if(a<b){
            result="loss";

        }else if(a==b){
            result="no loss";

        }

        return result;
    }
}
