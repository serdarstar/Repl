package Interview_Questions;

public class isAlphapetic {
    public static void main(String[] args) {
        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        System.out.println(isAlphabetic(str1));
        System.out.println(isDigit(str1));
        System.out.println(isLowercase(str1));
    }

    private static String isAlphabetic(String str1) {
        String decoded="";

        for (int i = 0; i < str1.length(); i++) {
            if (Character.isAlphabetic(str1.charAt(i))) {
                decoded+=str1.charAt(i);
            }

        }

        return decoded;

    }
    private static String isDigit(String str1) {
        String decoded="";

        for (int i = 0; i < str1.length(); i++) {
            if (Character.isDigit(str1.charAt(i))) {
                decoded+=str1.charAt(i);
            }

        }

        return decoded;

    }

    private static String isLowercase(String str1) {
        String decoded="";

        for (int i = 0; i < str1.length(); i++) {
            if (Character.isLowerCase(str1.charAt(i))) {
                decoded+=str1.charAt(i);
            }

        }

        return decoded;

    }

}
