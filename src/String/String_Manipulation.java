package String;

import java.util.Arrays;

public class String_Manipulation {
    public static void main(String[] args) {

        String a="Ahmet";
        String b="Mehmet";
        String c="ahmet";
        String e="Ahmet";
        System.out.println(a.charAt(0)+1);
        System.out.println(a.contains("met"));
        System.out.println(a.equals("Ahmet"));
        System.out.println(a.replace("A", "i"));
        System.out.println(a.replace("met", "yet"));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(c));
        String[] d=a.split("",a.length());
        System.out.println(Arrays.toString(d));
        System.out.println(a.indexOf("met"));
        System.out.println(a.subSequence(1, 4));
        System.out.println(a.substring(1, 4));
        System.out.println(a.matches(b));
        System.out.println(a.equals(e));
        System.out.println(a.matches(c));
        System.out.println(a.matches(e));
        System.out.println(a.endsWith("yet"));
        System.out.println(a.startsWith("Ah"));
        System.out.println(a.codePointAt(0));
        System.out.println(Character.isLowerCase('A'));

        System.out.println(Boolean.toString(true));
        System.out.println(Double.max(1.2, 1.6));
        int num=22;
        String[] f=String.valueOf(num).split("");
        System.out.println(Arrays.toString(f));
        System.out.println(Integer.compare(3,2));



    }

}
