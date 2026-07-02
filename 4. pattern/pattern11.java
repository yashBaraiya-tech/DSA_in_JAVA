import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {

        // 1
        // A B
        // 1 2 3
        // A B C D
        // 1 2 3 4 5

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0)
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (j + 64) + " ");
                }
            else
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
            System.out.println();
        }
    }
}
