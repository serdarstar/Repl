package Repl;

public class repl_189 {
    public static void main(String[] args) {
        String a="berror foo bar";
        String b="error";

//        method kullanmadan
//        boolean isError=a.startsWith(b);
//        System.out.println(isError);

        System.out.println(isError(a,b));;
        System.out.println(isError(a));

    }
    public static boolean isError(String c, String d){
        boolean isError=c.startsWith(d);
        return isError;

    }
//    method overloading ile farkli bir cozum
    public static boolean isError(String line)
    {
        String[] arr = line.split(" ");

        if(arr[0].equals("error")){
            return true;
        }else{
            return false;
        }

    }
}

