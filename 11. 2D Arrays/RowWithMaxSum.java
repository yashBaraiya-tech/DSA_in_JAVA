public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int rows = arr.length;
        int cols = arr[0].length;
        int maxsum = 0;
        int idx = 0;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            if (sum > maxsum) {
                idx = i;
                maxsum = sum;
            }
        }

        System.out.println("maxsum is "+maxsum);
        System.out.println("row "+idx);
    }
}
