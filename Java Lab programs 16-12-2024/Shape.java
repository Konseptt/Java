import java.util.Scanner;

public class Shape {
    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Circle area: " + shape.circleArea(radius));
        
        scanner.close();
    }
}
