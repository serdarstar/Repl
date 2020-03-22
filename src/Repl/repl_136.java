package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class repl_136 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        
        int sumLeft=matrix[0][0]+matrix[1][1]+matrix[2][2];
        int sumRigth=matrix[0][2]+matrix[1][1]+matrix[2][0];
        int difference=sumLeft-sumRigth;
        System.out.println("difference = " + difference);
        
        System.out.println(Arrays.deepToString(matrix));

    }
}
