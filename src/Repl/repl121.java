package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl121 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] words=str.split(", ");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        String shortestWord=words[0];
        int shortest=words[0].length();

        for (int i = 0; i < words.length; i++) {
           if (words[i].length()<shortest){
               shortestWord=words[i];
               shortest=words[i].length();
              }
        }

        int counter=0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()==shortest){
                counter++;
            }

        }

        String[] shortestWords=new String[shortest];
        int b=0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()==shortest) {
                shortestWords[b]=words[i];
                b++;

                System.out.println(words[i]);

            }

        }
        Arrays.sort(shortestWords);
        Arrays.toString(shortestWords);

    }
}
