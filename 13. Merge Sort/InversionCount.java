public class InversionCount {
    static int count = 0;

    public static void main(String[] args) {
        int arr[] = {5, 3, 9, 7, 1, 6, 8, 2};

        mergeSort(arr);

        System.out.println("Inversions = " + count);
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1)
            return;

        int[] a = new int[arr.length / 2];
        int[] b = new int[arr.length - arr.length / 2];

        int idx = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];

        mergeSort(a);
        mergeSort(b);

        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
                count += (a.length - i);
            }
        }

        while (i < a.length)
            c[k++] = a[i++];

        while (j < b.length)
            c[k++] = b[j++];
    }
}