import java.util.Scanner;

public class leastOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1 no");
        int a = sc.nextInt();

        System.out.println("enter 2 no");
        int b = sc.nextInt();

        System.out.println("enter 3 no");
        int c = sc.nextInt();

        if (a < b) {
            if (a < c)
                System.out.println(a);
            else
                System.out.println(c);
        } else if (b < c)
            System.out.println(b);
        else
            System.out.println(c);

    }
}
