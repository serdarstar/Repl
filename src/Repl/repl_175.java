package Repl;

import java.util.Arrays;

public class repl_175 {

    public static void main(String[] args) {
       String a= "1etsy#2wooden#3spoon";
       String b= "edit";
       String c="2";
       String d= "bbb";
        System.out.println(lameDb(a,b,c,d));

    }
    public static String lameDb(String db, String op,String id,String data) {
        String dummy = "";
        String diyez="#";
        String[] arr = db.split("#");
        System.out.println(Arrays.toString(arr));
        if(op.equals("add")){
            dummy=arr[0].concat(diyez).concat(arr[1]).concat(diyez).concat(arr[2]).concat(id).concat(data);
            System.out.println(dummy);

        }else if (op.equals("edit")&&id.equals("2")){

            dummy=arr[0].concat(diyez).concat(id).concat(data).concat(diyez).concat(arr[2]);
        }

    return dummy;
    }

}
