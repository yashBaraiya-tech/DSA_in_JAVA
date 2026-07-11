import java.util.ArrayList;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 2, 3 };
        System.out.println(duplicate(a));
    }

    public static ArrayList<Integer> duplicate(int a[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length;
        int i = 0;
        while (i < a.length) {
            int idx = a[i] - 1;
            if (a[i] == i + 1 || a[idx] == a[i])
                i++;
            else {
                int tmp = a[i];
                a[i] = a[idx];
                a[idx] = tmp;
            }
        }

        for (i = 0; i < a.length; i++) {
            if (a[i] != i + 1)
                ans.add(a[i]);
        }

        return ans;
    }
}
