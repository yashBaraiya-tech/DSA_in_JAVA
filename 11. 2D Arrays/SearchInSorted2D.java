public class SearchInSorted2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };
        int rows = arr.length;
        int cols = arr[0].length;
        int trg = 19;
        boolean flag = false;

        int i = 0, j = rows - 1;
        while (i < rows && j < cols) {
            int e = arr[i][j];
            if (e > trg)
                j--;
            else if (e < trg)
                i++;
            else {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("founded");
        else
            System.out.println("not founded");

    }
}
