package Repl;

import java.util.ArrayList;

public class repl_183 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(main(nums));

    }

    public static int main(ArrayList<Integer> args) {
        int sum=0;

        for (int i = 0; i < args.size(); i++) {
            sum+=args.get(i);


        }
        return sum;

    }
}
