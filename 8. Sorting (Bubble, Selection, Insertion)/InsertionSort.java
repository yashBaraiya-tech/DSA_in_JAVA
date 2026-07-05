public class InsertionSort {
    public static void main(String[] args) {
        int a[] = { 9, 8, 7, 4, 5, 6, 2, 1 };

        for (int i = 1; i < a.length; i++) {
            int j = i;

            while (j > 0 && a[j] < a[j - 1]) {
                int tmp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = tmp;
                j--;
            }

        }

        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}
