public class RotatedSearch {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        int target = 0;

        int l = 0, r = a.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (a[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            }

            // Left part sorted
            if (a[l] <= a[mid]) {
                if (target >= a[l] && target < a[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            // Right part sorted
            else {
                if (target > a[mid] && target <= a[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }

        System.out.println("Not Found");
    }
}

