package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_190 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        ArrayList<Integer> barrayList=new ArrayList<>();
        int sum=0;



        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i)>0){

                barrayList.add(arrayList.get(i));
                sum += arrayList.get(i);


            }
        }
        barrayList.add(sum);

        System.out.println(barrayList.toString());
    }
}
