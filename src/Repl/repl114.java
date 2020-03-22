package Repl;

public class repl114 {

    public static void main(String[] args) {
        int[]arr={1, 1, 2, 3, 4, 3, 4};

        for (int i = 0; i < arr.length-1; i++) {
          int counter=0;
          int newNum=arr[i];
          for(int j=0; j<arr.length;j++){
              if(arr[j]==newNum){
                  counter++;
              }

          }
           if (counter<2){
               System.out.println(newNum);
               break;


           }

        }
    }

}
