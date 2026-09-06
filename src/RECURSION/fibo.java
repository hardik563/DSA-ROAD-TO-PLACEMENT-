package RECURSION;

public class fibo {
    public static int fib(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n=4;
        int fi= fib(n);
        System.out.println(fi);


    }
}
