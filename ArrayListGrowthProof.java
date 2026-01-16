import java.lang.reflect.Field;
import java.util.ArrayList;

/*
 * This program proves that ArrayList increases its capacity
 * by 50% after exceeding the initial capacity.
 */
public class ArrayListGrowthProof {

    /*
     * Java does not provide a direct method to get ArrayList capacity.
     * So we use Reflection to access the internal elementData array.
     */
    static int getCapacity(ArrayList<?> list) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        return elementData.length;
    }

    public static void main(String[] args) throws Exception {

        // Create ArrayList with initial capacity = 10
        ArrayList<String> list = new ArrayList<>(10);

        // Add 10 elements (fills the initial capacity)
        for (int i = 1; i <= 10; i++) {
            list.add("IT2300" + i);
        }

        // Display capacity before exceeding
        System.out.println("ArrayList capacity before exceeding: " + getCapacity(list));
        System.out.println("ArrayList size before exceeding: " + list.size());

        // Add one more element (exceeds initial capacity)
        list.add("IT23011");

        // Display capacity after exceeding
        System.out.println("ArrayList capacity after exceeding: " + getCapacity(list));
        System.out.println("ArrayList size after exceeding: " + list.size());
    }
}
