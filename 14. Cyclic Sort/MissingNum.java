public class MissingNum {
    public static void main(String[] args) {
        int a[] = { 5, 1, 7, 9, 6, 2, 4, 8 };
        System.out.println(missingNum(a));
    }

    public static int missingNum(int a[]) {
        int n = 1 + a.length;
        int i = 0;

        while (i < a.length) {
            if (a[i] == i + 1 || a[i] == n)
                i++;
            else {
                int idx = a[i] - 1;
                int tmp = a[i];
                a[i] = a[idx];
                a[idx] = tmp;
            }
        }

        for (i = 0; i < a.length; i++) {
            if (a[i] != i + 1)
                return i+1;
        }

        return n;
    }
}