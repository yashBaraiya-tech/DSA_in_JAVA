public class search {
    public static void main(String[] args) {
        int a[] = { 2, 5, 4, 8, 9, 3, 4, 4, 2, 3, 6, 9, 7 };
        int target = 9;
        boolean isPresent = false;
        int index=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                isPresent = true;
                index = i;
                break;
            }
        }

        if (isPresent)
            System.out.println("Present at " + index + " index");
        else
            System.out.println("Not Present at " + index + " index");

    }
}
