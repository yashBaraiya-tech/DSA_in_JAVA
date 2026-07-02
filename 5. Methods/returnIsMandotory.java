public class returnIsMandotory {

    public static int a(int x) {
        if (x > 0)
            return x;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(a(5));
    }
}
