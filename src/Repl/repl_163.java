package Repl;

import java.util.Scanner;

public class repl_163 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        boolean notEmpty=scanner.nextBoolean();
        int taskId=scanner.nextInt();
        int currentId=scanner.nextInt();

        System.out.println(validateTask(notEmpty,taskId,currentId));
    }
    public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {

        boolean flag=false;

        if(notEmpty=true){
            if(taskId==currentId+1){
                flag=true;

            }

        }

        return flag;

    }
}
