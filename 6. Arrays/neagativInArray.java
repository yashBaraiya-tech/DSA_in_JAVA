public class neagativInArray {
    public static void main(String[] args) {
        int a[]={1,2,-8,-5,4,-3};

        for(int i=0;i<a.length;i++){
            if(a[i]<0) System.out.println(a[i]);
        }
    }
}
