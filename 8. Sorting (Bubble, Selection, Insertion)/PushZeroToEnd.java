public class PushZeroToEnd {
    public static void main(String[] args) {
        int a[] = { 5, 6, 0, 8, 1, 0, 5, 0, 6, 6, 0, 4, 0 };
        int n = a.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                if (i != j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }

        for (int e : a) {
            System.out.print(e + " ");
        }

    }
}
