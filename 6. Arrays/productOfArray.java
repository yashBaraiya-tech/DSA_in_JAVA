public class productOfArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int product = 1;

        for (int i = 0; i < a.length; i++) {
            product *= a[i];
        }
        System.out.println(product);
    }
}
