package Repl;

import java.util.Arrays;

public class repl_131 {
    public static void main(String[] args) {
        int[][] values=new int [2][3];
        values [0][0]=8;
        values [0][1]=20;
        values [0][2]=50;
        values [1][0]=12;
        values [1][1]=30;
        values [1][1]=75;

        System.out.println("values = " + Arrays.deepToString(values));
    }
}
