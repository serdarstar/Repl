package Repl;

public class repl_176 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        double[] barr={0.0,1.5,2.4,3.4,4.8};
        System.out.println(max(barr));
    }

    public static int max(int[] args) {
        int maxNum=0;

        for (int i = 0; i < args.length; i++) {
            if(args[i]>maxNum){
                maxNum=args[i];
            }

        }
        return maxNum;

    }
    public static double max(double[] args) {
        double maxNum=0;

        for (int i = 0; i < args.length; i++) {
            if(args[i]>maxNum){
                maxNum=args[i];
            }

        }
        return maxNum;

    }
}
