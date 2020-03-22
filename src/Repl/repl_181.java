package Repl;

import java.util.ArrayList;

public class repl_181 {
    public static void main(String[] args) {
        String[] a={"f","o","o"};
        String[] b={"b", "a", "r"};
        twoString(a,b);

    }

    public static String twoString(String[] args, String[] bargs) {
        String dummy="";
        ArrayList<String> c=new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            dummy+=args[i];

        }
        dummy=dummy+" ";

        for (int i = 0; i < bargs.length; i++) {
            dummy += bargs[i];

        }
        System.out.println(dummy.toString());

        return dummy;

    }
}
