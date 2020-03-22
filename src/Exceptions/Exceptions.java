package Exceptions;

public class Exceptions {
    public static void main(String[] args) throws Exception {

        int[] number = {1,2,3};
        try {
            for (int i = 0; i <= number.length; i++) {
                System.out.println(number[i]);
            }

            System.out.println("My name is ozzy");
        } catch (Exception e){
            System.out.println("sth wrong");
            e.printStackTrace();
        }
        finally {
            System.out.println("i work always");
        }


    }
}
