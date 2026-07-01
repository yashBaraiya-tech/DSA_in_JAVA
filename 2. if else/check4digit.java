import java.util.Scanner;

public class check4digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enrer no check length 4 or not");
        int n=sc.nextInt();

        if(n>999 && n<10000) System.out.println("4 digit no");
        else System.out.println("not 4 digit no");

    }
}
