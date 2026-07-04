public class maxEleInArr {
    public static void main(String[] args) {
        int a[]={1,6,2,3,65,5,99};
        // int max=a[0];
        int max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]>max) max=a[i];
        }

        System.out.println("maximum element is : "+max);
    }
}
