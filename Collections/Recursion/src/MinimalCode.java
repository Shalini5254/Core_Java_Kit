public class MinimalCode {
    static int firstOccurrence(int[] arr, int index, int target) {
        if (index == arr.length)
            return -1;

        if (arr[index] == target)
            return index;

        return firstOccurrence(arr, index + 1, target);
    }
    static int lastOccurrence(int[] arr, int index, int target) {
        if (index == arr.length)
            return -1;

        int foundInRest = lastOccurrence(arr, index + 1, target);

        if (foundInRest != -1)
            return foundInRest;

        if (arr[index] == target)
            return index;

        return -1;
    }

}
