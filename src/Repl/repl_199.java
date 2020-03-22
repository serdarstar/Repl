package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_199 {
    public static void main(String[] args) {
        ArrayList<Boolean> booleans=new ArrayList<>(Arrays.asList(true, false, true));
        repeatAll(booleans);
    }
    public static void repeatAll(ArrayList<Boolean> b){

        int x = b.size();
        for(int i=0; i<x; i++){

            b.add(x+i,b.get(i));
        }

        System.out.println(b.toString());
    }
}
