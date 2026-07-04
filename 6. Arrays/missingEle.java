public class missingEle {
    public static void main(String[] args) {
        int a[]={1,3,5,4,6,9,8,7};
        int sum=0;
        int n=a.length+1;
        int originalSum=(n*(n+1))/2;

        for(int e:a){
            sum+=e;
        }

        int miss=originalSum-sum;
        System.out.println(miss);
    }
}
