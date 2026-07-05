public class bubbleSort {
    public static void main(String[] args) {
        int a[] = { 5, 6, 9, 4, 1, 23, 6, 1 };
        int n = a.length;

        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();

        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - 1 - i; j++) {
        // if (a[j] > a[j + 1]) {
        // int tmp = a[j];
        // a[j] = a[j + 1];
        // a[j + 1] = tmp;
        // }
        // }
        // }

        // better version
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted)
                break;
        }

        for (int e : a) {
            System.out.print(e + " ");
        }

    }

}
