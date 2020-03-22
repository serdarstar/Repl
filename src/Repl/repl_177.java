package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_177 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList();
        test(arrayList);


    }
    public static ArrayList<Integer> test(ArrayList<Integer> e)  {
        e.add(1);
        e.add(2);
        System.out.println(Arrays.asList(e));
        for (Integer integer : e) {
            System.out.println(integer);

        }
        e.clear();
        System.out.println(".....................................");
        System.out.println(Arrays.asList(e));
        for (Integer integer : e) {
            System.out.println(integer);

        }

        return e;
        //write code here
    }
}
