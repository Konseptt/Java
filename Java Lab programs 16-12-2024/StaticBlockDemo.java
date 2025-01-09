public class StaticBlockDemo {
    private static int number;
    
    // Static block - executes when the class is loaded
    static {
        System.out.println("Static block is executed");
        number = 42;
    }
    
    public static void main(String[] args) {
        System.out.println("Main method is executed");
        System.out.println("Value of number: " + number);
    }
}
