public class Power {
    public static void main(String[] args) {
        int power = 1; 
        for (int i = 0; i <= 9; i++) {
            System.out.println("3^" + i + " = " + power);
            power *= 3; 
        }
    }
}
