package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_123{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int decimal=input.nextInt();
            int[] binary=new int[8];
            if(decimal/128==1){
                binary[0]=1;
                decimal=decimal%128;
            }if(decimal/64==1){
                binary[1]=1;
                decimal=decimal%64;
            }if(decimal/32==1){
                binary[2]=1;
                decimal=decimal%32;
            }if(decimal/16==1){
                binary[3] = 1;
                decimal = decimal%16;
            }if(decimal/8==1){
                binary[4] = 1;
                decimal = decimal%8;
            }if(decimal/4==1){
                binary[5] = 1;
                decimal = decimal%4;
            }if(decimal/2==1){
                binary[6] = 1;
                decimal = decimal%2;
            }if(decimal==1){
                binary[7] = 1;
            }
            System.out.println(Arrays.toString(binary));




        }
}
