/**
 * Java Lab programs 12/12/2024
 * Q4. Create a class named Counter that has:
 * • A static variable count
 * • A constructor that increments count whenever a new object is created.
 * Write a main method to create multiple Counter objects and display the total number of objects created using the count variable.
 */
public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Total number of Counter objects created: " + Counter.count);
    }
}
