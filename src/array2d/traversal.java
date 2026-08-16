package array2d;

import java.util.Scanner;

public class traversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];

        for (int i = 0; i < 2 ; i++) { //rows
            for (int j = 0; j < 3; j++) { //columns
                arr[i][j]=sc.nextInt();

            }

        }


        //output
        for (int i = 0; i < 2 ; i++) { //rows
            for (int j = 0; j < 3; j++) { //columns
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
         }


    }
}
