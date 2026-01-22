import java.util.*;

public class KthLargest {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(a);
        System.out.println("Kth Largest = " + a[a.length - k]);
    }
}

