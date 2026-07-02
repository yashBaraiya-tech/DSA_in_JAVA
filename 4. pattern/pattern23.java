import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {

        // - - - A
        // - - B B
        // - C C C
        // D D D D

        Scanner sc = new Scanner(System.in);

        System.out.println("enter n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n)
                    System.out.print((char)(i+64)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
