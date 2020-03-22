package Repl;

public class repl_145 {
    public static void main(String[] args) {
        int[] arr={1,2,55,-9,-2,0};

        plus_minus(arr);


    }

    public static void plus_minus(int[] arr) {

        int count1=0;
        int count2=0;
        int count3=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){count1++;
            }else if(arr[i]<0){count2++;

            }else if(arr[i]==0){count3++;

            }

        }

        System.out.println("positives:"+count1+", negatives:"+count2+", zeros:"+count3);

    }
}
