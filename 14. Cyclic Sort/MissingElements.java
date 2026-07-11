import java.util.ArrayList;

public class MissingElements {
    public static void main(String[] args) {
        int a[]={4,4,4,4,4,4};
        System.out.println(missedEle(a));
    }

    
    public static ArrayList<Integer> missedEle(int a[]) {
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
                ans.add(i+1);
        }

        return ans;
    }
}
