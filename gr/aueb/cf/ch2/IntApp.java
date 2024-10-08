package gr.aueb.cf.ch2;

/**
 * Display integer (int, byte, short, Long) data types, size and range
 */
public class IntApp {

    public static void main(String[] args) {

        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n", Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n", Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n", Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n", Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
