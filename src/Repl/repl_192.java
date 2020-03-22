package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_192 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4));
        timesTwo(arrayList);
    }
    public static void timesTwo(ArrayList<Integer> a){
        ArrayList<Integer> b=new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            b.add(a.get(i)*2);
        }
        System.out.println(b.toString());

        //ikinci cozum yolu
        for(int i=0; i<a.size(); i++){
            a.set(i,a.get(i)*2);
        }
        System.out.println(a.toString());
    }
}
