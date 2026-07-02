public class arguments {

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        sum(1, 2);
        System.out.println(multiply(4, 5));
    }
}
