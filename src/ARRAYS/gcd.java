package ARRAYS;

import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
//gcd of two numbers
        long x = a;
        long y = b;

        while (b != 0) {

            long rem = a % b;
            a = b;
            b = rem;
        }

        long gcd = a;
        long lcm = (x / gcd) * y;

        System.out.println(gcd + " " + lcm);
    }
}