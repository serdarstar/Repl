package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_137 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows

        int biggest = arr[0][0];

        for(int i=0; i<rows; i++){

            for(int j=0; j<cols; j++){

                if(arr[i][j]>biggest){

                    biggest = arr[i][j];

                }

            }
        }

        for(int a=0; a<rows; a++){

            for(int b=0; b<cols; b++){

                arr[a][b] = biggest;
            }
        }

        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));


    }
}