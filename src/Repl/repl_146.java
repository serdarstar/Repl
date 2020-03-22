package Repl;

public class repl_146 {
    public static void main(String[] args) {
        String str="jon,doe,30";

        System.out.println(person(str));;

    }

    public static String person(String args) {

        String[] a=args.split(",");

        String b="name: "+a[0]+" last name: "+a[1]+" age: "+a[2];
        return b;

    }
}
