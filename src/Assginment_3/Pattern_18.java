package Assginment_3;

public class Pattern_18 {
    /*
    Question-18:

Print following output using nested for loops.

4       3       2      1

     3       2      1

         2       1

              1
     */
    public static void main(String[] args) {



        for (int i = 1; i <= 4; i++)
        {
            //Printing i spaces at the beginning of each row
            String y="";
            for (int j = 1; j < i; j++)
            {
                y=y+" ";
            }

            //Printing i to rows value at the end of each row
            String x="";
            for (int j = i; j <= 4; j++)
            {
                x=x+j+" ";
            }
            System.out.println(y+x);
        }

    }



}
