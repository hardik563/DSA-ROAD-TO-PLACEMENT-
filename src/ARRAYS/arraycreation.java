package ARRAYS;
import java.util.*;

public class arraycreation {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER OF ELEMENTS YOU WANT TO PUT IN AN ARRAY:");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("ENTER THE ELEMENTS:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("ARRAY ELEMENTS ARE:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
