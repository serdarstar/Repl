package Repl;

import java.util.Scanner;

public class repl120 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                };

        System.out.println(minimum(str));

    }

    public static String minimum(String[] str) {
        int shortest = str[0].length();
        String shortestWord = str[0];

        for(int i=0; i<str.length; i++) {

            if (str[i].length() < shortest) {

                shortest = str[i].length();
                shortestWord = str[i];
            }

        }
        return shortestWord;

    }
}
