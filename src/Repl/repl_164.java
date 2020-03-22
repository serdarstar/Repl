package Repl;

import java.util.Scanner;

public class repl_164 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        boolean isAvailable=scanner.nextBoolean();
        int day=scanner.nextInt();
        int month=scanner.nextInt();
        int year=scanner.nextInt();

        System.out.println(booking(isAvailable,day,month,year));
    }

    public static boolean booking(boolean a, int b, int c, int d) {
        boolean flag=false;
        if(a==true){
            if(c==2018){
                if(b==7){
                    if(c>=1&&c<=8){
                        flag=true;
                    }

                }

            }

        }


        return flag;

    }
}
