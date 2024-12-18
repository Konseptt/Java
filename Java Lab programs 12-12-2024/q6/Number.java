/**
 * Java Lab programs 12/12/2024
 * Q6. Write a program to swap two numbers using a helper class:
 * • Create a class Number with attributes a and b.
 * • Write a method swap(Number n) that swaps the values of a and b.
 * • Print the values before and after calling the method.
 */
public class Number {
    int a, b;

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void swap(Number n) {
        int temp = n.a;
        n.a = n.b;
        n.b = temp;
    }

    public static void main(String[] args) {
        Number num = new Number(5, 10);
        System.out.println("Before swap: a = " + num.a + ", b = " + num.b);
        swap(num);
        System.out.println("After swap: a = " + num.a + ", b = " + num.b);
    }
}
