package Repl;

public class repl101<arr> {

    public static void main(String[] args) {
        String a="Ahmet";
        String b="Hanna";
        String c="Daniel";
        String d="George";
        String f="Michael";

        String [] arr= new String [5];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=f;

        System.out.println(firstLast(arr));

    }

    public static String firstLast(String[] arr) {
        String newWord="";
        for (int i = 0; i < arr.length; i++) {
          newWord=""+arr[i].charAt(0)+arr[i].charAt(arr.length-1);
            System.out.println("newWord = " + newWord);

        }

        return newWord;

    }
}
