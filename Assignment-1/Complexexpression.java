import java.util.Scanner;

public class Complexexpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, c, d, e, f, and g
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
        System.out.print("Enter value for d: ");
        int d = scanner.nextInt();
        System.out.print("Enter value for e: ");
        int e = scanner.nextInt();
        System.out.print("Enter value for f: ");
        int f = scanner.nextInt();
        System.out.print("Enter value for g: ");
        int g = scanner.nextInt();

        // Evaluate the expression
        if (d - e == 0) {
            System.out.println("Error: Division by zero in the expression.");
        } else {
            int result = (a + b * c) / (d - e) + f % g;
            System.out.println("The result of the expression is: " + result);
        }

        scanner.close();
    }
}
