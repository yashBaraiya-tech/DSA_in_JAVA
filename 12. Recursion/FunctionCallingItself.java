public class FunctionCallingItself {
    public static void main(String[] args) {
        print(5);
    }
    // n to 1
    // public static void print(int n) {
    //     if(n==0 ) return;
    //     System.out.print(n+" ");
    //     print(n-1);
    // }

    // 1 to  n
    // public static void print(int n) {
    //     if(n==0 ) return;
    //     print(n-1);
    //     System.out.print(n+" ");
    // }

    // n to 1, 1 to n
    public static void print(int n) {
        if(n==0 ) return;
        System.out.print(n+" ");
        print(n-1);
         System.out.print(n+" ");
    }
}
