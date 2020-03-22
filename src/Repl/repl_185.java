package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_185 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList("ali", "veli","deli"));
        arrayList.add(0,"hey");
        arrayList.add(4, "yo");
        System.out.println("arrayList.toString() = " + arrayList.toString());
    }
}
