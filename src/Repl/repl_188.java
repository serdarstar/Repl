package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_188 {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>(Arrays.asList("bir","iki","uc", "bir", "dort"));
        String target="bir";
        removeAll2(strings,target);

    }
    public static void removeAll(ArrayList<String> a, String b){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).contains(b)){
                a.remove(a.get(i));
            }

        }
        System.out.println(a.toString());

    }

    public static void removeAll2(ArrayList<String> wordList, String targetWord){

        for(int i=0; i<wordList.size();i++) {
            if (wordList.get(i).equals(targetWord)) {
                wordList.remove(i);
            }
        }
        System.out.println(wordList);
    }
}
