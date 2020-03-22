package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_125 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i =0; i < size; i++) {
                nums[i] = scan.nextInt();
            }
            int [] numsDouble=new int[nums.length*2];

            if (nums.length >0) {

            numsDouble[numsDouble.length-1]=nums[nums.length-1];
            System.out.println(Arrays.toString(numsDouble));

        }





    }
}
