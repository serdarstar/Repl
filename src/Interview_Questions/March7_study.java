package Interview_Questions;

public class March7_study {
    public static void main(String[] args) {

         /*Write a return method that can find the frequency of characters

       Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
       */


            String a= "AAABBCDD";
            String b="";

        for (int i = 0; i < a.length(); i++) {
            if(!b.contains(""+a.charAt(i))){
                b+=a.charAt(i);

            }

        }
        System.out.println("b = " + b);

        String expected="";
        for (int i = 0; i < b.length(); i++) {
            int count=0;
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(i)==b.charAt(j)){
                    count++;
                }
               expected +=b.charAt(j)+""+count;
            }
            System.out.println("expected = " + expected);
        }


        }



}
