public class RotatedSortArray {
    public static void main(String[] args) {
        int a[] = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        int low = 0;
        int high = a.length - 1;
        int trg = 8;
        int idx = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == trg) {
                idx = mid;
                break;
            } else if (a[low] < a[mid]) {
                if (a[low] <= trg && trg < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (a[mid] < trg && trg <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println(idx);

    }
}
