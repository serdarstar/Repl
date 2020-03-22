package Assginment_3;

public class Pattern_17 {
    public static void main(String[] args) {
        /*
        Question-17:

Print following output using nested for loops:
1
22
333
4444
55555
666666
7777777
         */

        for (int i = 1; i < 8; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(i);

            }
            System.out.println();

        }

    }
}
