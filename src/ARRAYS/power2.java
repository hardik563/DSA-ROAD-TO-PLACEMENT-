package ARRAYS;

import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println(false);
            return;
        }

        while (num % 2 == 0) {
            num = num / 2;
        }

        if (num == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
