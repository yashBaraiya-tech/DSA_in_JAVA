import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
