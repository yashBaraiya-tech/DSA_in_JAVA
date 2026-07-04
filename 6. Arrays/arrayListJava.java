import java.util.ArrayList;
import java.util.Collections;

public class arrayListJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(10);
        System.out.println(arr.get(1));

        arr.set(1, 20);
        System.out.println(arr.get(1));

        System.out.println(arr);
        arr.add(1, 100);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);

        // Collections.reverse(arr);
        int i = 0, j = arr.size()-1;
        while (i < j) {
            int tmp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, tmp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
