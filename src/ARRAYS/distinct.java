package ARRAYS;
import java.util.*;
public class distinct {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int c=0;
        for(int i=1;i<=n;i++){

            if(sum+i<=n){
                sum+=i;
                c++;}
            else {
                break;
            }

            }
        System.out.println(c);
        }

}
