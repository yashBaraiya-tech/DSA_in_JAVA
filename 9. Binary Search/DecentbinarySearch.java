public class DecentbinarySearch {
    public static void main(String[] args) {
        int a[] = { 100, 91, 87, 76, 66, 52, 43, 35, 24, 13, 5 };
        int low = 0;
        int high = a.length - 1;
        int target = 13;
        int idx = -1;
        boolean flag = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                flag = true;
                idx = mid;
                break;
            } else if (a[mid] > target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (flag)
            System.out.println("founded at " + idx);
        else
            System.out.println("not founded");
    }
}
