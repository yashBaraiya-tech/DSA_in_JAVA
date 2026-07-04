import java.util.Arrays;

public class sortBuiltIn {
    public static void main(String[] args) {
        int a[]={5,6,7,1,2,9,4,3,3,6,5};

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
