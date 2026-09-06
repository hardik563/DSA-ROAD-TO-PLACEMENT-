package RECURSION;

public class summ {
    public static int sum(int n){

        if(n==0) return 0;
        return n+sum(n-1);


    }

    public static void main(String[] args) {
        int n = 5;
        int sum = sum(n);
        System.out.println(sum);
    }
}
