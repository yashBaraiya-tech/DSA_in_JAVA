
public class FirstMissingPositive {
    public static void main(String[] args) {
        int a[] = { -1, 2, 1, 0, 5, 4 };
        System.out.println(firstMissPositive(a));
    }

    public static int firstMissPositive(int a[]) {

        int n = a.length;
        int i = 0;
        while (i < a.length) {

            if (a[i] <= 0 || a[i] == i + 1 || a[a[i] - 1] == a[i] || a[i] > n)
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
                return i + 1;
        }

        return n;
    }
}
