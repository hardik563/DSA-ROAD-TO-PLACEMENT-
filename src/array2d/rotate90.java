package array2d;


import java.util.*;
public class rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[3][3];



        System.out.println("Enter elements of matrix:");

        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // columns
                arr1[i][j] = sc.nextInt();
            }
        }




        System.out.println( "rotate 90 degree matrix:");

        for (int i = 0; i < 3; i++) { // rows
            for (int j = i+1; j < 3; j++) { // columns
                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
        }
        //rotate -> reverse each row after transpose
        for (int i = 0; i < 3; i++) {
            int a = 0, b = 3 - 1;
            while (a < b) {
                int temp = arr1[i][a];
                arr1[i][a] = arr1[i][b];
                arr1[i][b] = temp;
                a++;
                b--;
            }
        }
        // Output of result matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
