import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        // * * * * *
        // * * * * *
        // * * * * *

        Scanner sc = new Scanner(System.in);

        System.out.println("enter row no");
        int n = sc.nextInt();

        System.out.println("enter col no");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
