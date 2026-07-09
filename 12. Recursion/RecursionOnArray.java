public class RecursionOnArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printArray(a, 0);
        System.out.println(checkExist(a, 8, 0));

    }

    // print
    public static void printArray(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        System.out.println(arr[idx]);
        printArray(arr, idx + 1);
    }

    // existance check
    public static boolean checkExist(int[] arr, int target, int idx) {
        if (arr[idx] == target)
            return true;
        if(idx==arr.length) return false;

        return checkExist(arr, target, idx+1);
    }
}
