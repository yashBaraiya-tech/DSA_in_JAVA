public class UniquePath {

    public static void main(String[] args) {
        // System.out.println(uniquePath(5, 8));
        System.out.println(uniquePath(0, 0, 5, 8));
        System.out.println(uniquePath(0, 0, 4, 7));
    }

    // way 1
    // public static int uniquePath(int m, int n) {
    // if (m == 1 || n == 1)
    // return 1;
    // return uniquePath(m - 1, n) + uniquePath(m, n - 1);
    // }

    // way 2
    public static int uniquePath(int cr, int cc, int lr, int lc) {
        if (cr == lr || cc == lc)
            return 1;
        if (cr > lr || cc > lc)
            return 0;
        int right = uniquePath(cr, cc + 1, lr, lc);
        int down = uniquePath(cr + 1, cc, lr, lc);
        return right + down;
    }
}