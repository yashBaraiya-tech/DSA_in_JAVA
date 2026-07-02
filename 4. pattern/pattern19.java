import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {

        // 1 
        // 1 3
        // 1 3 5
        // 1 3 5 7

        Scanner sc = new Scanner(System.in);

        System.out.println("enter n:");
        int n = sc.nextInt();
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count += 2;
            }
            System.out.println();
            count = 1;
        }
    }
}
