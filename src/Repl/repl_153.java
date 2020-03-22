package Repl;

public class repl_153 {

    public static void main(String[] args) {
        String a="java, code, python, code, rust, code, rust";
        String[] words=a.split(", ");


        for (int i = 0; i < words.length; i++) {
            int count=0;
            for (int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])){count++;

                }

            }
            if(count==1){
                System.out.println(words[i]);
            }
        }

    }

}
