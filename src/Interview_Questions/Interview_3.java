package Interview_Questions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Interview_3 {
    public static void main(String[] args) {
        /*
        Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC

         */

    String a="AAABBBCCC";

    }
    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);



        return result;

    }
    public static String removeDup2(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = str.replace(", ","").replace("[","").replace("]","");

        return  str;

    }
}
