public class MergeArray {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 5, 9 };
        int b[] = { 2, 2, 6, 7, 8 };
        int i = 0, j = 0, k = 0;
        int c[] = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        for (int e : c) {
            System.out.print(e + " ");
        }
    }
}
