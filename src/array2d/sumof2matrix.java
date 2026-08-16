package array2d;

import java.util.Scanner;

public class sumof2matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] result = new int[3][3];

        // Input for first matrix
        System.out.println("Enter elements of first matrix:");

        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // columns
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter elements of second matrix:");

        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // columns
                arr2[i][j] = sc.nextInt();
            }
        }

        // Addition of two matrices
        System.out.println("SUM OF TWO MATRICES IS:");

        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // columns
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Output of result matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}