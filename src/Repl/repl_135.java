package Repl;

import java.util.Arrays;

public class repl_135 {
    public static void main(String[] args) {
        int [] nums={6,5,2,3};
        int a=nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            nums[i]=nums[i+1];

        }
        nums[nums.length-1]=a;
        System.out.println(Arrays.toString(nums));
    }
}
