public class segegrates0and1 {
    public static void main(String[] args) {
        int a[] = { 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1 };

        // method 1
        // int zero = 0;

        // for (int e : a) {
        // if (e == 0)
        // zero++;

        // }
        // for(int i=0;i<zero-1;i++){
        // a[i]=0;
        // }
        // for(int i=zero;i<a.length;i++){
        // a[i]=1;
        // }
        // for(int e:a){
        // System.out.print(e+" ");
        // }

        // method 2
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] == 1 && a[j] == 0) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;

            } else if (a[i] == 0)
                i++;
            else if (a[j] == 1)
                j--;
        }
        for (int e : a) {
            System.out.print(e + " ");
        }

    }
}
