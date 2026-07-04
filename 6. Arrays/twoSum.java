public class twoSum {
    public static void main(String[] args) {
        int a[] = { 2, 3, 6, 5, 4, 1, 8, 9, 6, 4, 5, 2, 5 };
        int target = 8;
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println(i+""+j);
                    System.out.println(a[i] + " + " + a[j] + " = " + target);
                    return;
                }
            }
        }

    }
}
