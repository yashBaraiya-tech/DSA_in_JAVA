import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {

        // A A A A
        // B B B B
        // C C C C
        // D D D D

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
