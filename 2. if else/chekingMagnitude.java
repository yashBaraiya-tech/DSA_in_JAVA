import java.util.Scanner;

public class chekingMagnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no:");
        int n = sc.nextInt();

        n = (n < 0) ? -n : n;

        System.out.println((n>69)?"bigget than 69":"smaller than 69");

    }
}
