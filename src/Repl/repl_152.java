package Repl;

public class repl_152 {
    public static void main(String[] args) {
        int[] arr={2, 5, 5, 6, 3, 6, 9, 34, 3};

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){count++;

                }

            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }

    }

}
