public class Kadane {
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSoFar = a[0];
        int current = a[0];

        for (int i = 1; i < a.length; i++) {
            current = Math.max(a[i], current + a[i]);
            maxSoFar = Math.max(maxSoFar, current);
        }

        System.out.println("Max Subarray Sum = " + maxSoFar);
    }
}

