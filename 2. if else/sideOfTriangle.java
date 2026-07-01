import java.util.Scanner;

public class sideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1 side of triangle:");
        int a = sc.nextInt();

        System.out.println("enter 2 side of triangle:");
        int b = sc.nextInt();

        System.out.println("enter 3 side of triangle:");
        int c = sc.nextInt();

        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("side of triangle");
        } else {
            System.out.println("not side of tringle");
        }
    }
}
