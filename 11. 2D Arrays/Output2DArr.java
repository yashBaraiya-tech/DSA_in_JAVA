public class Output2DArr {
    public static void main(String[] args) {
        // int[][] arr = new int[3][4];
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Rows = " + rows + ", Cols = " + cols);

        // row wise
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // column wise
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}