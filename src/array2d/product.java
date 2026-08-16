package array2d;



import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];
        int product=1;

        for (int i = 0; i < 2 ; i++) { //rows
            for (int j = 0; j < 3; j++) { //columns
                arr[i][j]=sc.nextInt();

            }

        }
        System.out.println("PRODUCT OF 2-D ARRAY IS");

        for (int i = 0; i < 2 ; i++) { //rows
            for (int j = 0; j < 3; j++) {
                product=product*arr[i][j];

            }

        }
        System.out.println(product);




        //output
        for (int i = 0; i < 2 ; i++) { //rows
            for (int j = 0; j < 3; j++) { //columns
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }


    }
}
