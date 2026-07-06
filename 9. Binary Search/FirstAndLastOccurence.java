import java.util.ArrayList;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 5, 6, 7, 8, 8, 8, 9, 9 };
        int low = 0;
        int high = a.length - 1;
        int target = 8;
        int idx = -1;
        boolean flag = false;
        ArrayList<Integer> ans = new ArrayList<>();

        // first occurence
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] < target) {
                low = mid + 1;
            } else if (a[mid] > target)
                high = mid - 1;
            else { // a[mid]==target
                idx = mid;
                high = mid - 1;
                flag = true;
            }
        }
        ans.add(idx);

        // last occurence
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] < target) {
                low = mid + 1;
            } else if (a[mid] > target)
                high = mid - 1;
            else { // a[mid]==target
                idx = mid;
                low = mid + 1;
                flag = true;
            }
        }
        ans.add(idx);

        System.out.println(ans);

    }
}
