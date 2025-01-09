import java.util.Scanner;

public class StaticDemo {
    private static int count = 0;

    public static void increment() {
        count++;
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        increment();
        increment();
        increment();
    }
}
