package Repl;

public class repl_170 {
    public static void main(String[] args) {
        String  a="he said bla bla bla said";
        String b="bla";
        System.out.println(badWord(a,b));
        System.out.println(badWord2(a,b));

    }

    public static String badWord(String aNew, String bNew) {
        if (aNew.contains(bNew)){
            aNew=aNew.replace(bNew,"");
        }
        return aNew;
    }

    public static String badWord2(String aNew, String bNew) {
        String[] arr=aNew.split(" ");
        String dummy="";
        for (int i = 0; i < arr.length; i++) {

             if(!arr[i].equals(bNew)){
                 dummy+=arr[i]+" ";
             }

        }
        return dummy;
    }
}
