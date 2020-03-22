package Repl;

public class repl_166 {
    public static void main(String[] args) {
       String a= "12345";
       String b="abcd";

       int size1=a.length();
       int size2=b.length();
       String c="";
        for(int i=0; i<size1+size2; i++){

            if(i<size1){
                c += a.charAt(i);
            }if(i<size2){
                c += b.charAt(i);
            }
        }
        System.out.println("c = " + c);

    }

}
