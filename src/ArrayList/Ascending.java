package ArrayList;

import java.util.ArrayList;

public class Ascending {
    public static void main(String[] args) {
        int [] a={200,5,6,99};

        int max=a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]>max){
                max=a[i+1];
            }

        }

        ArrayList<Integer> asc=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i]<max){

                asc.add(a[i]);

            }

        }
        asc.add(max);
        System.out.println(asc.toString());

    }
}
