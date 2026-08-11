package ARRAYS;

import java.util.Scanner;

public class PRIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("NO");
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
