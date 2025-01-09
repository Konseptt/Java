import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Sum: " + calc.add(n1, n2));
        
        scanner.close();
    }
}
