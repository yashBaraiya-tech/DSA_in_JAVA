public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 8, 9, 10, 15 };
        int low = 0;
        int high = a.length - 1;
        int k = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int correctNo = mid + 1;
            int missing = a[mid] - correctNo;
            if (missing >= k)
                high = mid - 1;
            else
                low = mid + 1;
        }

        System.out.println((high+1+k));
    }
}
