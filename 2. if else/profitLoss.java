import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter cost price");
        double cost = sc.nextDouble();

        System.out.println("enter sellinng price");
        double sell = sc.nextDouble();

        if (sell > cost) {
            System.out.println("profit is " + (sell - cost));
        } else if (cost > sell) {
            System.out.println("loss is " + (cost - sell));
        } else {
            System.out.println("no loss no profit");
        }

    }
}
