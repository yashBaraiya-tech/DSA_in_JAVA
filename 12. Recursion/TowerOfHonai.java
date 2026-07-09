public class TowerOfHonai {
    public static void main(String[] args) {
        honoi(3, 'A', 'B', 'C');
    }

    public static void honoi(int n, char a, char b, char c) {
        if (n == 0)
            return;
        // n-1 disk from a -> b via c
        honoi(n - 1, a, c, b);
        // largest from a to c
        System.out.println(a + "->" + c);
        // n-1 disk from b to c via a
        honoi(n - 1, b, a, c);
    }
}
