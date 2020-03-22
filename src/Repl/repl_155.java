package Repl;

public class repl_155 {
    public static void main(String[] args) {
        String[] some_array ={"a","foo","bar","foo","bla"};
        String some_string = "foo";

        System.out.println(count_appearance(some_array,some_string));

    }

    public static int count_appearance(String[] args, String a) {
        int counter=0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals(a)) {
                counter++;

            }

        }
        return counter;

    }
}
