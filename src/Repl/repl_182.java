package Repl;

import java.util.ArrayList;

public class repl_182 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        nums.add(-1);
        nums.set(2,99);
        nums.set(0,100);
        System.out.println(nums.toString());

        ArrayList<String> words=new ArrayList<>();
        words.add("a");
        words.add("b");
        words.add("c");
        words.set(0,"git");
        words.set(2,"gud");
        System.out.println(words.toString());
    }
}
