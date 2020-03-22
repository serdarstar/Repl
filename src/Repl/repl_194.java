package Repl;

public class repl_194 {
    public static void main(String[] args) {
        String a="noon";

        System.out.println(palindrome(a));

    }
    public static boolean palindrome(String a) {

        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse += a.charAt(i);

        }
        System.out.println("reverse = " + reverse);

        boolean isPalindrome=false;
        if (reverse.equalsIgnoreCase(a)) {

            isPalindrome = true;
            System.out.println("isPalindrome = " + isPalindrome);


        }
        return isPalindrome;


    }
}
