package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_Descending_08 {
    public static void main(String[] args) {
        /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
     */


        List<Integer> b=new ArrayList<>(Arrays.asList(200,5,6,99));

        SortingArrayListDesc(b);

    }
    public static void SortingArrayListDesc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    int temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);
                    System.out.println("list = " + list);

                }

            }

        }
        System.out.println("list = " + list);
    }

}
