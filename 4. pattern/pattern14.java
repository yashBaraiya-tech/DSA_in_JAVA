import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {

        // a b c d
        // a b c
        // a b
        // a

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size n:");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }
    }
}
