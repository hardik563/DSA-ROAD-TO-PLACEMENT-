package ARRAYS;
import java.util.*;
public class productmodule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long r=sc.nextLong();
        long m=sc.nextLong();
        long mul=1;
        for(long i=l;i<=r;i++){
            mul*=i;

        }
        long rem=mul%m;
        System.out.println(rem);
    }
}
