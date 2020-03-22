package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Some_Values_15 {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
     */
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(15,564,34,40, 350));
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i)>100){
                arrayList.remove(arrayList.get(i));
            }

        }
        System.out.println(arrayList.toString());

    }

}
