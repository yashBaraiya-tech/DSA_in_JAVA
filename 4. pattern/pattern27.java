import java.util.Scanner;

public class pattern27 {
    public static void main(String[] args) {

        // * * * * * * * * *
        // * * * * - * * * *
        // * * * - - - * * *
        // * * - - - - - * *
        // * - - - - - - - *

        Scanner sc = new Scanner(System.in);

        System.out.println("enter n:");
        int n = sc.nextInt();

        for (int i = 1; i <= (2 * n + 1); i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int a = i; a <= n; a++) {
                System.out.print("* ");
            }
            for (int b = 1; b <= (2 * i - 1); b++) {
                System.out.print("  ");
            }
            for (int a = i; a <= n; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
