import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius of cicle: ");
        int r = sc.nextInt();
        double area = (3.14 * r * r);
        System.out.println("Area of cicle is " + area);
    }
}
