public class ReverceRow {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            int st = 0, end = cols - 1;
            while (st < end) {
                int tmp = arr[i][st];
                arr[i][st] = arr[i][end];
                arr[i][end] = tmp;
                st++;
                end--;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
