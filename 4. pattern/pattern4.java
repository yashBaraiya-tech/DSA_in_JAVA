import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        // a b c d
        // a b c d
        // a b c d
        // a b c d

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size n:");
        int n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }
    }
}
