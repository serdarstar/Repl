package Repl;

import java.util.Scanner;

public class repl115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        String max="";

        for (int i = 0; i < words.length-1; i++) {
            for (int j = 0; j < words.length-1; j++) {

                if(words[j].length()>words[j+1].length()){
                    max=words[j];

                }else {
                    max=words[j+1];
                }

            }

        }

        System.out.println("max = " + max);

    }
}
