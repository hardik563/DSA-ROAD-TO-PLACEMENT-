package RECURSION;

public class nto1 {
    public static void  ntoo1(int n){
        if(n==0)return;
        System.out.println(n);
        ntoo1(n-1);
    }

    public static void main(String[] args) {
        ntoo1(5);
    }
}
