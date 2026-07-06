public class PeakInMountainArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8,9, 4, 3, 2, 1 };
        int low = 1;
        int high = a.length - 2;
        int idx = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
                idx = mid;
                break;
            } else if (a[mid] > a[mid - 1] && a[mid] < a[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(a[idx]);
    }
}
