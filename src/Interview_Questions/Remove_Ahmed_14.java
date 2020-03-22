package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Ahmed_14 {
    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>(Arrays.asList("Ali", "Ahmet", "Veli", "Deli", "Ahmet"));
        remove(a);
        remove2(a);

    }
    public static void remove(ArrayList<String> arrayList){

        for (int i = 0; i < arrayList.size(); i++) {
             if(arrayList.get(i).equals("Ahmet")){
                 arrayList.remove(arrayList.get(i));
             }
        }
        System.out.println(arrayList.toString());
    }

    public static void remove2(ArrayList<String> arrayList){

        ArrayList<String> names = new ArrayList<>(arrayList);
        names.removeAll( Arrays.asList("Ahmet"));

        System.out.println(names);
    }


}
