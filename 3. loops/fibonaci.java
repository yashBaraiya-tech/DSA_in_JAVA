import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first no:");
        int a = sc.nextInt();

        System.out.println("enter second no:");
        int b = sc.nextInt();

        System.out.println("enter no of term");
        int n = sc.nextInt();

        int next = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }

    }
}
