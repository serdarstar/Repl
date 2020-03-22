package Assginment_3;

import javax.swing.plaf.basic.BasicTextAreaUI;

public class Pattern_20 {
    /*
    Question-20:

Print following chess board using nested for loops.
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
     */
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j)%2==0){
                    System.out.print("W");
                }else {System.out.print("B");}



            }
            System.out.println();
        }

    }
}
