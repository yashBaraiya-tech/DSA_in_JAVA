public class oddNoDiviBy3 {
    public static void main(String[] args) {
        
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%2==1){
                System.out.print(i+" ");
            }
        }

    }
}
