package ARRAYS;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER  NUMBER ELEMENT IN AN ARRAY:");
        int n = sc.nextInt();
        System.out.println("ENTER ARRAY ELEMENTS:");
        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("SUM OF ARRAY ELEMENT ARE ="+sum);
    }
}