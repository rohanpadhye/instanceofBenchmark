package quickinstance;


import java.util.Random;

/**
 * @author Rohan Padhye
 *
 * This class helps calculate a unique type bit-signature (called typeID) for each class/interface.
 *
 * Each program class then has a unique type ID and a mix ID, which is a union of all typeIDs of
 * the classes and interfaces it extends/implements.
 *
 * The mix ID is essentially a bloom filter.
 *
 */
public class TypeBits {

    private static final int BITS = 3;
    private static final int SIZE = 62;
    private static final Random random = new Random();

    private static synchronized long createIDwithReplacement(int k) {
        long result = 0;
        for (int i = 0; i < k; i++) {
            int bit = random.nextInt(SIZE);
            result = result | (1L << bit);
        }
        return result;
    }

    public static synchronized long freshID() {
        return createIDwithReplacement(BITS);
    }

    public static void main(String args[]) {
        System.out.println(freshID());
    }
}
