package Interview_Questions;

public class Interview_5 {
    public static void main(String[] args) {
        /*
        Write a return method that can reverse  String

        Ex: Reverse("ABCD"); ==> DCBA
         */

        String a="Yavuz";
        System.out.println(reverse2(a));
    }

    public static String reverse(String str){
        String reverse="";
        String [] a=str.split("");
        for (int i = a.length-1; i >=0; i--) {
            reverse+=a[i];

        }
        return reverse;
    }
    public  static String  reverse2(String str) {

        return new StringBuffer(str).reverse().toString();

    }
}
