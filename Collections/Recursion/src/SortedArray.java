public class SortedArray {
    static boolean isSorted(int[] arr, int index) {
        // Base case: reached last element
        if (index == arr.length - 1)
            return true;

        // If current > next, not sorted
        if (arr[index] > arr[index + 1])
            return false;

        // Check remaining array
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
}
