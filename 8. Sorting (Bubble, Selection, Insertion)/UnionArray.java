import java.util.ArrayList;
import java.util.Arrays;

public class UnionArray {
    public static void main(String[] args) {
        int a[] = { 5, 6, 8, 4, 11, 3, 9 };
        int b[] = { 5, 11, 2, 3, 8, 55, 66 };

        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] > b[j]) {
                ans.add(b[j]);
                j++;
            } else {
                ans.add(a[i]);
                i++;
            }
        }

        while (i < a.length) {
            ans.add(a[i]);
            i++;
        }

        while (j < b.length) {
            ans.add(b[j]);
            j++;
        }

        System.out.println(ans);
    }
}
