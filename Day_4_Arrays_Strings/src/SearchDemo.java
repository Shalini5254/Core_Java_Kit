import java.util.*;

public class SearchDemo {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int key = 7;

        // Linear Search
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                System.out.println("Found at index " + i);
        }

        // Binary Search
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == key) {
                System.out.println("Binary Found at index " + mid);
                break;
            } else if (a[mid] < key)
                l = mid + 1;
            else
                r = mid - 1;
        }
    }
}

