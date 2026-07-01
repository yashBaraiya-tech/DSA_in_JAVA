public class printGP {
    public static void main(String[] args) {
        // 1,2,4,8,..... n term
        int a = 1;
        int r = 2;
        int n = 15;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a *= r;
        }
    }
}
