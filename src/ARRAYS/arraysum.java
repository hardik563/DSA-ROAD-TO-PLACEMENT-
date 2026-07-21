package ARRAYS;

import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENT IN AN ARRAY:");
        int n=sc.nextInt();

        System.out.println("Enter array elements:");
        int [] arr=new int [n];
        // Input array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];

        }
        System.out.println("THE SUM OF ARRAY IS =" + sum);


    }
}
