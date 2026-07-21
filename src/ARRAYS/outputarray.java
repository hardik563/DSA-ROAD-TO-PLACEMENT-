package ARRAYS;

import java.util.Scanner;

public class outputarray {
    public static void main(String[] args) {
        System.out.println("ENTER ELEMENTS IN AN ARRAY:");
        Scanner sc=new Scanner(System.in);
        //number of element in array
        int[] arr=new int[7];
        //input
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("THE ELEMENTS YOU ENTERED ARE :");
        //output
        //using for loop
        for(int i=0;i<7;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
