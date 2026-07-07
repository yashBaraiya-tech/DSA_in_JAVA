public class SpiralTravelin2D {
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

        int fr = 0, lr = rows - 1, fc = 0, lc = cols - 1;
        while (fr <= lr && fc <= lc) {
            // right
            for (int i = fc; i <= lc; i++) {
                System.out.print(arr[fr][i] + " ");
            }
            fr++;
            if (fr > lr || fc > lc)
                break;

            // down
            for (int i = fr; i <= lr; i++) {
                System.out.print(arr[i][lc] + " ");
            }
            lc--;
            if (fr > lr || fc > lc)
                break;

            // left
            for (int i = lc; i >= fc; i--) {
                System.out.print(arr[lr][i] + " ");
            }
            lr--;
            if (fr > lr || fc > lc)
                break;

            // up
            for (int i = lr; i >= fr; i--) {
                System.out.print(arr[i][fc] + " ");
            }
            fc++;

        }

    }
}
