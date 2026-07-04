public class secondMaxEle {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 3, 4, 5 };
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // maximum element
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        // second maximum element
        for (int i = 0; i < a.length; i++) {
            if (a[i] > smax && a[i] != max)
                smax = a[i];
        }

        System.out.println(max);
        System.out.println(smax);

    }
}
