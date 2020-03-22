package Interview_Questions;

public class String_unique {
    public static void main(String[] args) {
        String a="asddfsggsfgka";
        String unique="";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if(!unique.contains(a.charAt(j)+"")){
                    unique=unique+a.charAt(j);
                }


            }

        }
        System.out.println("unique = " + unique);
    }
}
