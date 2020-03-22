package Repl;

public class repl_149 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 77, 8};
        int b = 20;

        doubleArray(nums, b);
    }

    public static void doubleArray(int[] r, int a) {
        //create new array with one more position.
        int[] new_r = new int[r.length + 1];

        for (int i = 0; i < r.length; i++) {

            new_r[i] = r[i];
        }

        new_r[r.length] = a;

        for (int array : new_r) {

            System.out.print(array+" ");
        }

    }
}

