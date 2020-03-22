package Interview_Questions;

import java.util.*;

public class Map_Sort_the_map_by_Values {
    public static void main(String[] args) {
/*
Write a method that can sort the Map by values
 */

        Map<String,Integer> newMap=new HashMap<>();
        newMap.put("Ali",5);
        newMap.put("Veli",2);
        newMap.put("Deli",10);
        sortByValue(newMap);
    }
    public static Map<String, Integer> sortByValue(Map<String, Integer> map){

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap();

        for(Map.Entry<String, Integer> each : list) {

            map.put(each.getKey(), each.getValue());

        }
        System.out.println("map = " + map);

        return map;

    }
}
