public class Factoral {
    public static void main(String[] args) {
        long f = 1; 
        for (int n = 1; n <= 100; n++) {
            f *= n;
            if (f > 362880) {
                System.out.println("Factorial of " + n + " greater than 362880. ");
                break;
            }
            System.out.println("Factorial of " + n + " = " + f);
        }
    }
}
