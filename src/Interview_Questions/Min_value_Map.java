package Interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Min_value_Map {
    /*
    Write a method that can return the minimum value from ta map (DO NOT use sort method)
     */
    public static void main(String[] args) {

        Map<String,Integer> newMap=new HashMap<>();
        newMap.put("Ali",5);
        newMap.put("Veli",2);
        newMap.put("Deli",10);

        minValue(newMap);
        System.out.println( minValue(newMap));
    }
    public  static  int  minValue( Map<String,Integer> map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());
//        System.out.println("sm.first().toString() = " + sm.first().toString());

        return sm.first( );

    }

}
