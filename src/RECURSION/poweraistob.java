package RECURSION;

public class poweraistob {
    public static int power(int a,int b){
        if(b==1)return a;
        return a*power(a,b-1);
    }

    public static void main(String[] args) {
        int a=3;
        int b=3;
        int p=power(a,b);
        System.out.println(p);
    }
}
