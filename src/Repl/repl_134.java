package Repl;

import java.util.Arrays;

public class repl_134 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];


        for (int i = 0; i < chessBoard.length; i++) {
            char ch='a';
            for (int j = 0; j < chessBoard.length; j++) {
                chessBoard[i][j]=""+(i+1)+ch;
                ch++;

            }

        }
        System.out.println(Arrays.deepToString(chessBoard));

    }
}
