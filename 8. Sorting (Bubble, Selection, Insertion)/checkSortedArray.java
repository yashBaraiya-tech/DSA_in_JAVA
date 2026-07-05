public class checkSortedArray {
    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 3, 5, 7, 8, 9, 11 };
        boolean isSort = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                isSort = false;
                break;
            }
        }

        if (isSort)
            System.out.println("sorted");
        else
            System.out.println("not sorted");
    }
}
