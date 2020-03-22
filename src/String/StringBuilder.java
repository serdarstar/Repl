package String;

import java.util.ArrayList;
import java.util.Arrays;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder a=new java.lang.StringBuilder("java");
        System.out.println("a = " + a);
        System.out.println("a.append(\"tava\") = " + a.append("tava"));
        System.out.println("a.reverse() = " + a.reverse());
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(2,3,4,5));
        ArrayList<Integer> arrayList1=new ArrayList<>(Arrays.asList(2,3,4));
        System.out.println("arrayList.equals(arrayList1) = " + arrayList.addAll(arrayList1));
        System.out.println("arrayList = " + arrayList);
    }
}
