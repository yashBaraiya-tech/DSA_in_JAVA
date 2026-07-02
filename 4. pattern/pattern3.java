import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        // A B C D
        // A B C D
        // A B C D

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }

    }
}
