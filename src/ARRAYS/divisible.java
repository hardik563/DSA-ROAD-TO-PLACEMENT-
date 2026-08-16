package ARRAYS;

import java.util.*;
public class divisible{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long x=sc.nextLong();
        if(x<=0){
            System.out.println("NO");
        }
        else if(n%x==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

}


}