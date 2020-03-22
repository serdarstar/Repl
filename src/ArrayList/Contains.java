package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Contains {
    public static void main(String[] args) {

        ArrayList<String> menuOptions=new ArrayList<>(Arrays.asList("Ali", "Veli", "Deli"));
        ArrayList<String> actualMenuOptions=new ArrayList<>(Arrays.asList("Ali", "Veli", "Deli", "Kupeli"));
        Collections.reverse(actualMenuOptions);
        Collections.sort(actualMenuOptions);
        menuOptions.add("aaa");
        System.out.println(actualMenuOptions);



        boolean is=false;
        int count=0;

        for (int i = 0; i < actualMenuOptions.size(); i++) {
            for (int j = 0; j < menuOptions.size(); j++) {
                if(actualMenuOptions.get(i).equals(menuOptions.get(j))){

                    count++;

                }

            }
            if(count==menuOptions.size()){
                is=true;
            }

        }
        System.out.println(is);



    }





}
