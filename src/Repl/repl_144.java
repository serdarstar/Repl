package Repl;

public class repl_144 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int c=-5;

        System.out.println(signum(a));
        System.out.println(signum(b));
        System.out.println(signum(c));

    }

    public static int signum(int a) {
        int d=0;
        if (a<0){d=-1;
        }else if(a>0){d=+1;

        }else if(a==0){d=0;

        }

        return d;
    }
}
