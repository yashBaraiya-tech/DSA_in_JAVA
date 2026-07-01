import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no for prime cheking");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n < 2)
            isPrime=false;
        else
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        if (isPrime)
            System.out.println("prime number");
        else
            System.out.println("not prime number");

    }
}
