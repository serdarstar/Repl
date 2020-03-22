package Repl;

public class repl_168 {
    public static void main(String[] args) {
        String a="java methods";
        String b="me";

        if (a.contains(b)){
            System.out.println(a.indexOf(b));
            System.out.println(a.substring(0,a.indexOf(b))+"["+b+"]"+a.substring(b.length()+a.indexOf(b)));

        }


    }
}
