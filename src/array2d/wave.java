package array2d;
import java.util.Scanner;
public class wave {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] arr = new int[3][3];

            for (int i = 0; i < 3; i++) { //rows
                for (int j = 0; j < 3; j++) { //columns
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                if (i % 2 == 0) {//rows
                    for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");

                    }
                } else {
                    for (int j = 3 - 1; j >= 0; j--) {
                        System.out.print(arr[i][j] + " ");
                    }

                }
            }
        }
}
