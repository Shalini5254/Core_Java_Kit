import java.util.*;

public class MergeSort {
    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);

            merge(a, l, mid, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (a[i] <= a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];

        for (i = l, k = 0; i <= r; i++, k++)
            a[i] = temp[k];
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 8, 4, 2};
        mergeSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }
}

