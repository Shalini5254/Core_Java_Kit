public class MaxMin {
    public static void main(String[] args) {
        int[] a = {4, 2, 9, 1, 7};

        int max = a[0], min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

