import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String g = sc.nextLine();
        // System.out.println(g);

        // String t = sc.next();
        // System.out.println(t);

        String s="Yash Baraiya";
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}