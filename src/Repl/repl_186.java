package Repl;

import java.util.Arrays;

public class repl_186 {
    public static void main(String[] args) {
        String str="aa2aa3";
        String digit="";
        String[] strings=str.split("");
         System.out.println(Arrays.toString(strings));


        for (int i = 0; i < strings.length; i++) {
          if(Character.isDigit(str.charAt(i))){
              digit=digit+str.charAt(i);

          }

        }
        System.out.println(digit);

    }
}
