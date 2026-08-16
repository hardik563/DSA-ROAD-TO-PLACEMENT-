package array2d;

import java.util.Scanner;

public class sumof2darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];
        int sum=0;

        for (int i = 0; i < 2 ; i++) { //rows
            for (int j = 0; j < 3; j++) { //columns
                arr[i][j]=sc.nextInt();

            }

        }
        System.out.println("SUM OF 2-D ARRAY IS");

        for (int i = 0; i < 2 ; i++) { //rows
            for (int j = 0; j < 3; j++) {
                sum=sum+arr[i][j];

            }

        }
        System.out.println(sum);




        //output
        for (int i = 0; i < 2 ; i++) { //rows
            for (int j = 0; j < 3; j++) { //columns
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }


    }
}


