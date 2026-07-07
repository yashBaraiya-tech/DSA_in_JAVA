public class RotatedBy90 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
        int rows = arr.length;
        int cols = arr[0].length;
        int [][] ans=new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[j][cols-1-i]=arr[i][j];
            }
            
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
