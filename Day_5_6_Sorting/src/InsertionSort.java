public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1};

        for (int i = 1; i < a.length; i++) {
            int key = a[i];     // element to insert
            int j = i - 1;

            // Shift elements to the right
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;   // insert at correct position
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}

