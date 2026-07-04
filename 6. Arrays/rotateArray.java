public class rotateArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 1;
        d = d % a.length;

        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
        swap(0, d - 1, a);
        swap(d, a.length - 1, a);
        swap(0, a.length - 1, a);

        for (int e : a) {
            System.out.print(e + " ");
        }

    }

    public static void swap(int i, int j, int arr[]) {
        int a[] = arr;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
