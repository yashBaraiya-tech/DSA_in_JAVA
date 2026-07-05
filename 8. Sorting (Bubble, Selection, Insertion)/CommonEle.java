import java.util.ArrayList;
import java.util.Arrays;

public class CommonEle {
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
                j++;
            } else {
                i++;
            }
        }

        System.out.println(ans);

    }
}
