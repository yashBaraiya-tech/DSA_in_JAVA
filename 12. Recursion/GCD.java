public class GCD {
    public static void main(String[] args) {
        int gcd = 1;
        int n = 5;
        int m = 16;

        // using for loop
        // for (int i = 2; i <= Math.min(n, m); i++) {
        //     if (n % i == 0 && m % i == 0) {
        //         gcd = i;
        //     }
        // }

        System.out.println(GCD(12, 18));
    }

    // using recursion
    public static int GCD(int a, int b) {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }
}
