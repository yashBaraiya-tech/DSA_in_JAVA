public class FloorinSortedArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
        int low = 0;
        int high = a.length - 1;
        int idx = -1;
        int target = 5;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > target)
                high = mid - 1;
            else { // arr[mid] <= x
                idx = mid;
                low = mid + 1;
            }
        }

        System.out.println(idx);
    }
}
