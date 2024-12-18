/**
 * Java Lab programs 12/12/2024
 * Q3. Create a class named Rectangle with:
 * • Attributes: length and width
 * • Constructor to initialize these attributes
 * • A method calculateArea() to return the area of the rectangle.
 * Write a main method to create a Rectangle object and print its area.
 */
public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = length;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 3.0);
        double area = myRectangle.calculateArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
