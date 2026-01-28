class MaxElement {

    static int findMax(int[] arr, int index) {

        // Base case: last element
        if (index == arr.length - 1)
            return arr[index];

        // Max of remaining array
        int maxInRest = findMax(arr, index + 1);

        // Compare current element with rest
        return Math.max(arr[index], maxInRest);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 4, 2};
        System.out.println(findMax(arr, 0));
    }
}

