public class permutationCombination {

    public static int fact(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String[] args) {
        System.out.println(nCr(7, 3));
    }
}
