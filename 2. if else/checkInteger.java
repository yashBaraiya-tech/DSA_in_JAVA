import java.util.Scanner;

public class checkInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number for cheking is integer or not:");
        double n = sc.nextDouble();

        int x = (int) n;
        if (n - x == 0) {
            System.out.println("it is integer");

        } else {
            System.out.println("not integer");
        }

    }
}
