package Repl;

public class repl_167 {

        public static void main(String[] args) {
            //test your code
            System.out.println( uniqueChars("wooden-spoon") ) ;
        }

        public static String uniqueChars(String str) {

            String dummy = "";
            for(int i=0; i<str.length(); i++){


                                    //bu kismi sor
                if(!dummy.contains(""+str.charAt(i))){
                    dummy += str.charAt(i);
                }
            }

            return dummy;
        }



}
