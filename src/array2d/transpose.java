package array2d;
import java.util.*;
public class transpose {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] arr1 = new int[3][3];
            int[][] transpose=new int[3][3];


            System.out.println("Enter elements of matrix:");

            for (int i = 0; i < 3; i++) { // rows
                for (int j = 0; j < 3; j++) { // columns
                    arr1[i][j] = sc.nextInt();
                }
            }




            System.out.println( "TRANSPOSE OF MATRIX:");

            for (int i = 0; i < 3; i++) { // rows
                for (int j = 0; j < 3; j++) { // columns
                    transpose[i][j] = arr1[j][i];
                }
            }

            // Output of result matrix
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }

    }
}
