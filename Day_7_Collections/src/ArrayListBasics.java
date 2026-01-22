import java.util.*;

public class ArrayListBasics {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);

        System.out.println("List: " + list);

        // Get
        System.out.println("Element at index 1: " + list.get(1));

        // Update
        list.set(1, 99);
        System.out.println("After update: " + list);

        // Remove
        list.remove(2);
        System.out.println("After remove: " + list);

        // Size
        System.out.println("Size: " + list.size());
    }
}

