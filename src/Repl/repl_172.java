package Repl;

public class repl_172 {
    public static void main(String[] args) {
        String a = "longword";
        String b="foo";
        System.out.println(insert(a,b));

    }

    public static String insert(String c, String d) {
        c=c.substring(0,3).concat(d).concat(c.substring(3));

        return c;

    }
}
