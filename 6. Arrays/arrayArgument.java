public class arrayArgument {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println(a[2]);
        changr(a);
        System.out.println(a[2]);
    }

    public static void changr(int x[]) {
        x[2]=55;
    }
}
