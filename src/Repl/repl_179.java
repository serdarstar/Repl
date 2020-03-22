package Repl;

public class repl_179 {
    public static void main(String[] args) {
        String word="student";

        System.out.println(reverse(word));

    }

    public static String reverse(String a) {
        String dummy="";
        for (int i = a.length()-1; i >=0; i--) {

            dummy+=a.charAt(i);


        }
        return dummy;
    }
}
