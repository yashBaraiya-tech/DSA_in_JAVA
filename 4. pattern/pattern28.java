import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args) {

        // 1 1 1 1 1 1 1
        // 1 2 2 2 2 2 1
        // 1 2 3 3 3 2 1
        // 1 2 3 4 3 2 1
        // 1 2 3 3 3 2 1
        // 1 2 2 2 2 2 1
        // 1 1 1 1 1 1 1

        Scanner sc = new Scanner(System.in);

        System.out.println("enter n:");
        int n = sc.nextInt();
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int a = i, b = j;
                if (i > n)
                    a = 2 * n - i;
                if (j > n)
                    b = 2 * n - j;

                System.out.print(Math.min(a, b)+" ");
            }
            System.out.println();
        }
    }
}
