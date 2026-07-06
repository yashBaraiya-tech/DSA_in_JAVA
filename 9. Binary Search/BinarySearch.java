public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8,  14, 16, 18, 20 };
        int low = 0;
        int high = a.length - 1;
        int target = 9;
        boolean flag = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                flag = true;
                break;
            } else if (a[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        if (flag)
            System.out.println("founded");
        else
            System.out.println("not founded");
    }
}
