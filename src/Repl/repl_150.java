package Repl;

import java.util.Scanner;

public class repl_150 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {

        String[] arr = s.split(":");
        String[] arr2 = arr[2].split("");
        String clock = "";

        if(arr2[2].equals("A")){
            if(arr[0].equals("12")){
                clock = "00:" + arr[1] + ":" + arr2[0] + arr2[1];
            }else{
                clock = arr[0] + ":" + arr[1] + ":" + arr2[0] + arr2[1];
            }
        }else if(arr2[2].equals("P")){
            if(arr[0].equals("12")){
                clock = arr[0] + ":" + arr[1] + ":" + arr2[0] + arr2[1];
            }else{
                int num = Integer.parseInt(arr[0]);
                clock = (num + 12) + ":" + arr[1] + ":" + arr2[0] + arr2[1];
            }
        }

        System.out.println(clock);
    }
}
