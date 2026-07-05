import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int a[] = { 7, 0, 4, 3, 2, 8, 10 };
        int target = 9;
        int i = 0;
        int j = a.length - 1;
        boolean isFound = false;

        Arrays.sort(a);

        while (i < j) {
            if (a[i] + a[j] == target) {
                System.out.println(a[i] + " " + a[j]);
                isFound = true;
            } else if (a[i] + a[j] > target) {
                j--;
            } else {
                i++;
            }
            if (isFound)
                break;
        }

    }
}
