import java.util.Scanner;

public class areaComarition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter breadth");
        int b = sc.nextInt();

        System.out.println("enter length");
        int l = sc.nextInt();

        int perimeter = 2 * (l + b);
        int area = l * b;

        if (area > perimeter)
            System.out.println("are is grater than perimeter");
        else if (perimeter > area)
            System.out.println("perimeter is grter tahn area");
        else
            System.out.println("both are same");
    }
}
