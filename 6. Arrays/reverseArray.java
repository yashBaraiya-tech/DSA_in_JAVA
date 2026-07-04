public class reverseArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int i = 0, j = a.length - 1;

        for(int e:a){
            System.out.print(e+" ");
        }

        System.out.println();
        while (i<j) {
            int tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
            i++;
            j--;
        }

        for(int e:a){
            System.out.print(e+" ");
        }
    }

}
