package Repl;

import java.util.Arrays;

public class repl117 {
    public static void main(String[] args) {
        String [] numbers={"zero", "one", "two","three","four"};

        int counter=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].contains("e")){
                counter++;
            }

        }

        System.out.println("counter = " + counter);
        String[] arr=new String[counter];
        int z=0;
        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j].contains("e")){
               arr[z]=numbers[j];
               z++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
