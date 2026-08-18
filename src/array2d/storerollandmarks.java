package array2d;
import java.util.*;
public class storerollandmarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][2];


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 ; j++) {
               arr[i][j]=sc.nextInt();

            }
        }

        System.out.println("Roll no   Marks");

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 2 ; j++) {
                System.out.print(arr[i][j]+  "      ");

            }
            System.out.println();

        }


    }
}
