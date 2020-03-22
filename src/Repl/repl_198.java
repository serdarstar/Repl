package Repl;

import java.util.Arrays;

public class repl_198 {
    public static void main(String[] args) {

        int[] ints={10, 20, 30,40, 50};
        int[] ints2={10, 20, 30, 14, 45};
        System.out.println(Arrays.toString(add(ints, ints2)));
    }
    public static int[] add(int[] a, int[] b){
        int[] ints3=new int[5];

        for (int i = 0; i < ints3.length; i++) {
            ints3[i]=a[i]+b[i];

        }

        return ints3;
    }
}
