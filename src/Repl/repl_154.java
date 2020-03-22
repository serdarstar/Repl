package Repl;

import java.util.Scanner;

public class repl_154 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        String reversedNum = "";
        int num2 = num;
        while(num2>0){

            reversedNum += num2%10;
            num2 = num2/10;
        }

        int newNum = Integer.parseInt(reversedNum);

        System.out.println(num==newNum);


    }

}
