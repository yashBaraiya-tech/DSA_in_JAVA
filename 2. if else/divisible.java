import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");
        int n=sc.nextInt();

        if(n%3==0){
            if(n%5==0){
                System.out.println(n+" is divible by 3 & 5");
            }else{
                System.out.println(n+" is divisible by only 3");
            }
        }else if(n%5==0){
            System.out.println(n+" is divisible by only 5");
        } else{
            System.out.println("not divided by 3 or 5");
        }
    }
}
