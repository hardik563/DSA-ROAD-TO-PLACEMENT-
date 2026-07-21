package ARRAYS;

import java.util.Scanner;

public class rollnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] student = new int[n];

        // Input marks
        System.out.println("Enter marks of students:");
        for (int i = 0; i < n; i++) {
            student[i] = sc.nextInt();
        }

        // Print roll numbers of students scoring less than 35
        System.out.println("Roll numbers of failed students:");

        for (int i = 0; i < n; i++) {
            if (student[i] < 35) {
                System.out.print(i + " ");
            }
        }

        }
}