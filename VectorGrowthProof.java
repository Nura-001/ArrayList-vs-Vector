import java.util.Vector;

/*
 * This program proves that Vector increases its capacity
 * by 100% (doubles) after exceeding the initial capacity.
 */
public class VectorGrowthProof {

    public static void main(String[] args) {

        // Create Vector with initial capacity = 10
        Vector<String> vector = new Vector<>(10);

        // Add 10 elements (fills the initial capacity)
        for (int i = 1; i <= 10; i++) {
            vector.add("IT2300" + i);
        }

        // Display capacity before exceeding
        System.out.println("Vector capacity before exceeding: " + vector.capacity());
        System.out.println("Vector size before exceeding: " + vector.size());

        // Add one more element (exceeds initial capacity)
        vector.add("IT23011");

        // Display capacity after exceeding
        System.out.println("Vector capacity after exceeding: " + vector.capacity());
        System.out.println("Vector size after exceeding: " + vector.size());
    }
}
