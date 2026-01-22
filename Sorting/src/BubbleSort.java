public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};

        // Each pass pushes the largest element to the end
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {

                // Swap if current > next
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}

