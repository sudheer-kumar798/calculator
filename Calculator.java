
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Java Console Calculator ===");

        while (true) {
            System.out.print("\nEnter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result;
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/': 
                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes")) break;
        }

        System.out.println("Calculator closed.");
        sc.close();
    }
}