import java.util.*;
public class divisor{
    public static void main(String args[]){
        long sum=0;
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(long i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;

            }

        }
        System.out.println(sum);
    }
}