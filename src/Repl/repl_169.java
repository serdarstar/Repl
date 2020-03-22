package Repl;

public class repl_169 {
    public static void main(String[] args) {
        String a="foo bar three";

        System.out.println(wordCount(a));
    }

    public static int wordCount(String b) {
        int wordNum=0;
        String [] str=b.split(" ");
        wordNum=str.length;
        return wordNum;

    }
}
