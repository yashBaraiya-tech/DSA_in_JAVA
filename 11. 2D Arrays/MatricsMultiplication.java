public class MatricsMultiplication {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        int[][] b = {
                { 31, 32, 33, 34, 35 },
                { 36, 37, 38, 39, 40 },
                { 41, 42, 43, 44, 45 },
                { 46, 47, 48, 49, 50 },
                { 51, 52, 53, 54, 55 }
        };
        int rows = a.length;
        int cols = a[0].length;
        int c[][] = new int[rows][cols];
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // c[i][j] = ith row of a * jth col of b
                for (int k = 0; k < n; k++) {
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
