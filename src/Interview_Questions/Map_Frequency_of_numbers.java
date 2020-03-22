package Interview_Questions;

import java.util.*;

public class Map_Frequency_of_numbers {
    public static void main(String[] args) {

        String str="aabbbcdeeeff";
        FrequencyTest(str);
    }
    public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new HashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);

            }

        }

        System.out.println(map);

    }


}
