public class waveArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int i = 0;
        int j = 1;

        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();

        while (j < a.length) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i+=2;;
            j+=2;
        }

        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}
