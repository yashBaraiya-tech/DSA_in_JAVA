public class SelectionSort {
    public static void main(String[] args) {
        int a[] = { 5, 9, 1, 6, 7, 3, 2, 8, 4 };
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minInx = -1;

            for (int j = i; j < n; j++) {
                if (min > a[j]) {
                    min = a[j];
                    minInx = j;
                }
            }

            int tmp = a[i];
            a[i] = a[minInx];
            a[minInx] = tmp;
        }

        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}
