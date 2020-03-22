package Repl;

import java.util.Scanner;

public class repl_148 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
        next4(num);

    }

    public static void next3(int args) {
        System.out.println((args+1)+", "+(args+2)+", "+(args+3));

    }

    public static void next4(int args) {
        for (int i = 0; i < 3; i++) {
            System.out.print(args+1+" ");
            args++;

        }

    }
}
