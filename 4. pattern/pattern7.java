import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {

        // a a a a
        // B B B B
        // c c c c
        // D D D D

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (i + 64) + " ");
                }
            else
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (i + 96) + " ");
                }
            System.out.println();
        }
    }
}
