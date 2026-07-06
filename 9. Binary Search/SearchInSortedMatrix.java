import java.util.ArrayList;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] a = {
                { 10, 15, 20, 25 },
                { 27, 29, 30, 32 },
                { 33, 35, 37, 39 },
                { 40, 45, 48, 50 }
        };

        int row = a.length;
        int col = a[0].length;
        int low = 0;
        int high = row * col - 1;
        int trg = 50;
        ArrayList<Integer> idx=new ArrayList<>();

        while (low <= high) {
            int mid = (low + high) / 2;
            int midRow = mid / col;
            int midcol = mid % col;

            if (a[midRow][midcol] == trg) {
               idx.add(midRow);
               idx.add(midcol);
                break;
            } else if (a[midRow][midcol] > trg) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }

        System.out.println(idx);
    }
}
