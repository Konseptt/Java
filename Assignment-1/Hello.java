public class Hello {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.0f;
        double d = 60.0;
        char c = 'A';
        boolean bool = true;

        System.out.println("b (byte): " + b);
        System.out.println("s (short): " + s);
        System.out.println("i (int): " + i);
        System.out.println("l (long): " + l);
        System.out.println("f (float): " + f);
        System.out.println("d (double): " + d);
        System.out.println("c (char): " + c);
        System.out.println("bool (boolean): " + bool);

        System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");
        System.out.println("Size of boolean: " + (Boolean.TRUE ? 1 : 1) + " byte (not precisely defined)");
    }
}