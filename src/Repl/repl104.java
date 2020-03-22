package Repl;

public class repl104 {
    public static void main(String[] args) {
        int[] arr={1,2,5,5,1};
        
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==5&&arr[i+1]==5){
                flag=true;
                break;
                
            }

        }
        System.out.println("flag = " + flag);



    }
}
