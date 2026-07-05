public class dupicateEle {
    public static void main(String[] args) {
        int a[] = { 5, 1, 3, 4, 2, 4 };
        int dup = a[0];

        // method 1
        // boolean flag = false;

        // for (int i = 0; i < a.length; i++) {
        // for (int j = i; j < a.length; j++) {
        // if (a[i] == a[j])
        // flag = true;
        // dup=a[j];
        // break;
        // }
        // }
        // if (flag)
        // System.out.println("duplicate: " + dup);
        // else
        // System.out.println("not availble");

        // method 2
        // boolean flag[] = new boolean[a.length + 1];
        // for (int i = 0; i < a.length; i++) {
        // int ele = a[i];
        // if (flag[ele] == true) {
        // dup = ele;
        // break;
        // } else {
        // flag[ele] = true;
        // }
        // }
        // System.out.println(dup);

        // method 3
        int sumArray = 0, sum = (a.length * (a.length - 1)) / 2;
        for (int e : a) {
            sumArray += e;
        }
        System.out.println(sumArray - sum);

    }
}
