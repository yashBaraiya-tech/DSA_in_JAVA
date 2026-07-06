public class sqrt {
    public static void main(String[] args) {
        int low = 0;
        int trg = 9;
        int high = trg;
        int idx = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == trg) {
                idx = mid;
                break;
            } else if (mid * mid > trg)
                high = mid - 1;
            else
                low = mid + 1;
        }

        System.out.println(idx);
    }
}
