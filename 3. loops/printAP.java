public class printAP {
    public static void main(String[] args) {
        // 2,5,8,11,.... n term
        int n = 15; // 15 terms
        int d = 3;
        int a = 2;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += d;
        }

    }
}
