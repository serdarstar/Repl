package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_178_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <5; i++) {
            arrayList.add(i);

        }
        ArrayList<Integer> arrayList2=new ArrayList<>();
        for (int i = 5; i <10; i++) {
            arrayList2.add(i);

        }
        arrayList.addAll(arrayList2);
        System.out.println(Arrays.asList(arrayList2));
        System.out.println(arrayList.toString());
    }
}
