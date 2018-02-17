package de.michaeldorner;


import java.util.Random;

/**
 * @author Rohan Padhye
 *
 * This class helps calculate a unique type bit-signature (called typeID) for each class/interface.
 *
 * Each program class then has a unique type ID and a mix ID, which is a union of all typeIDs of
 * the classes and interfaces it extends/implements.
 */
public class TypeBits {

    private static final int ONES = 4;
    private static final int SIZE = 62;

    private static final long[] POOL = new long[choose(SIZE, ONES)];
    private static final Random random = new Random();

    static int factorial(int n) {
        return n <= 0 ? 1 : (n * factorial(n-1));
    }

    static int bounded_factorial(int n, int terms) {
        return terms == 0 ? 1 : (n * bounded_factorial(n-1, terms - 1));
    }

    static int choose(int n, int k) {
        return bounded_factorial(n, k)/(factorial(k));
    }

    static {
        long val = (1L << ONES) - 1;
        long bound = (1L << SIZE) - 1;
        int i = 0;
        while (val <= bound) {
            POOL[i++] = val;
            long c = val & -val;
            long r = val + c;
            val = (((r^val) >> 2) / c) | r;
        }
        assert i == POOL.length;
    }

    public static synchronized long freshID() {
        return POOL[random.nextInt(POOL.length)];
    }

    public static void main(String args[]) {
        System.out.println(freshID());
    }
}
