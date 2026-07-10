public class MergeSort {
    public static void main(String[] args) {
        int a[] = { 9, 5, 1, 7, 3, 4, 2, 6, 8, 10 };
        mergSort(a);
        for (int e : a) {
            System.out.print(e + " ");
        }
    }

    public static void mergSort(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return;

        // step 1 create two array
        int a[] = new int[n / 2];
        int b[] = new int[n - n / 2];

        // step 2 copy elemnt
        int idx = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];

        // step 3 magic (recursion)
        mergSort(a);
        mergSort(b);

        // step 4 merge
        merge(a, b, arr);
    }

    public static void merge(int[] a, int b[], int[] c) {
        int i = 0, j = 0, k = 0;
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
    }
}
