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
