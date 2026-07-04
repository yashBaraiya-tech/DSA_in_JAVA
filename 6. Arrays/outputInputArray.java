import java.util.Scanner;

public class outputInputArray {
    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        // default value
        System.out.println("default value");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // input in array
        System.out.println("input");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter index " + i + " element");
            arr[i] = sc.nextInt();
        }

        // print element of arrays
        System.out.println("output");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
