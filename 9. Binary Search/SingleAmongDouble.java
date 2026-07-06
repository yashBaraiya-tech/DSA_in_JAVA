public class SingleAmongDouble {
    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2, 3,  5, 5, 6, 6, 7, 7, 8, 8 };
        int idx = 0;
        int low = 0;
        int n = a.length;
        int high = n;

        if (a.length == 1)
            idx = 0;
        if (a[0] != a[1])
            idx = 0;
        if (a[n - 1] != a[n - 2])
            idx = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] != a[mid - 1] && a[mid] != a[mid + 1]) {
                idx = mid;
                break;
            }

            int f = mid, s = mid;

            if (a[mid - 1] == a[mid])
                f = mid - 1;
            else
                s = mid + 1;

            int leftCount = f - low;
            int rightCount = high - s;

            if (leftCount % 2 == 0)
                low = s + 1;
            else
                high = f - 1;

        }

        System.out.println(a[idx]);
    }
}
