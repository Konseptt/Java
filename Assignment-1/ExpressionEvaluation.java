import java.util.Scanner;

public class ExpressionEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        System.out.print("d: ");
        double d = scanner.nextDouble();
        System.out.print("e: ");
        double e = scanner.nextDouble();
        System.out.print("f: ");
        double f = scanner.nextDouble();
        System.out.print("g: ");
        double g = scanner.nextDouble();
        double result = (a + b * c) / (d - e) + f % g;
        System.out.println("Result of the expression: " + result);
        scanner.close();
    }
}