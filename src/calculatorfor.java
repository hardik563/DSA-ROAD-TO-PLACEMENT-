import java.util.Scanner;

public class calculatorfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Answer = " + (a + b));
                break;
            case 2:
                System.out.println("Answer = " + (a - b));
                break;
            case 3:
                System.out.println("Answer = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Answer = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}