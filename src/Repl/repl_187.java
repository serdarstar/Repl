package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_187 {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>(Arrays.asList("bir","iki","uc"));
        ArrayList<String> strings1=new ArrayList<>(Arrays.asList("dort", "bes", "alti"));
        ArrayList<String> strings2=new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            strings2.add(strings.get(i));

        }

        for (int i = 0; i < strings1.size(); i++) {
            strings2.add(strings1.get(i));

        }
        System.out.println(strings2.toString());
    }
}
