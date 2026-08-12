package ARRAYS;
import java.util.*;
import java.math.*;
public class distance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long x1=sc.nextLong();
        long y1=sc.nextLong();
        long x2=sc.nextLong();
        long y2=sc.nextLong();
        double ans=Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        System.out.println(ans);
    }
}