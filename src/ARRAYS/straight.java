package ARRAYS;

import java.util.*;
public class straight{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long x1=sc.nextLong();
        long y1=sc.nextLong();
        long x2=sc.nextLong();
        long y2=sc.nextLong();
        long x3=sc.nextLong();
        long y3=sc.nextLong();
        if(x1 == x2 && x2 == x3 || y1 == y2 && y2 == y3 || x1==y1 && x2==y2 && x3==y3) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
