public class minEleArray {
    public static void main(String[] args) {
        int a[]={3,35,9,1,3,9,4,3,11};
        int min=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]<min) min=a[i];
        }
        System.out.println(min);
    }
}
