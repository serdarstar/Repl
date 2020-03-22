package Repl;

public class repl_195 {
        public static void main(String[] args) {

        String a="Listen";
        String b="silent";
            System.out.println(isAnagram(a,b));
        }


        public static boolean isAnagram(String word1, String word2) {

                boolean flag = false;
                word1 = word1.toLowerCase().replace(" ","");
                word2 = word2.toLowerCase().replace(" ","");
            System.out.println(word1);

                if(word1.length()==word2.length()){
                    String dummy = "";
                    for(int i=0; i<word1.length(); i++){
                        for(int j=0; j<word2.length(); j++){
                            if(word1.charAt(i)==(word2.charAt(j))){
                                dummy += "" + word2.charAt(j);
                            }
                        }
                    }
                    if(word1.equals(dummy)){
                        flag = true;
                    }
                }
                return flag;
            }


}
