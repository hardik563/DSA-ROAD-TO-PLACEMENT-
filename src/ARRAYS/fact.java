package ARRAYS;

import java.util.*;
public class fact{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        int c=0;
        while(fact>0){

            c++;
            fact=fact/10;
        }
        System.out.println("Number of digits of "+ n + " ! " + "is " + c);

    }
}