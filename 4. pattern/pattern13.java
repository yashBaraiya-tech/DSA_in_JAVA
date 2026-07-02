import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {

        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size n:");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
