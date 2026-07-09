public class Sum {

    public static void main(String[] args) {
        System.out.println(sun(5));
    }
    public static int sun(int n){
        if(n==0) return 0;
        return n+sun(n-1);
    }
}