import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class AddingOne {
    public static void main(String[] args) {
        int a[] = { 5, 6, 1, 9 };
        int carry = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] + carry <= 9) {
                ans.add(a[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }
        if (carry == 1)
            ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
