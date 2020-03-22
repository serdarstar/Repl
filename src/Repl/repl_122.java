package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int biggest = inhabitants[0];

        for(int j=0; j<inhabitants.length; j++){

            if(inhabitants[j]>biggest){

                biggest = inhabitants[j];
            }

        }
        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        int day = 1;

        while(biggest!=0){

            for(int j=0; j<inhabitants.length; j++){

                inhabitants[j] = inhabitants[j]/2;

            }

            biggest = biggest / 2;

            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

            day++;
        }

        System.out.println("---- EXTINCT ----");

    }
}
