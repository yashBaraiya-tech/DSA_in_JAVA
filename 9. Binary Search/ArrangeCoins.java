public class ArrangeCoins {
    public static void main(String[] args) {
        int n = 13;
        int low = 0;
        int high = n;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            int m = (mid * (mid + 1)) / 2;

            if (m == n) {
                ans = mid;
                break;
            } else if (m > n) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
