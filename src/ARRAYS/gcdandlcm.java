package ARRAYS;

import java.util.*;

public class gcdandlcm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long x = a;
        long y = b;

        long temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        long rem = b % a;

        while (rem > 0) {
            rem = b % a;
            b = a;
            a = rem;
        }

        long lcm = (x * y) / b;

        System.out.print(b + " " + lcm);
    }
}