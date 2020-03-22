package Repl;

public class repl_196 {
    public static void main(String[] args) {
        Calc calc=new Calc();
        calc.setX(10);
        calc.setY(20);
        calc.plus();
        System.out.println(calc.getResult());

    }
}
