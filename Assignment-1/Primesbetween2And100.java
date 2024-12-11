public class Primesbetween2And100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 2 and 100 are:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " ");
            }
        }
    }
}
