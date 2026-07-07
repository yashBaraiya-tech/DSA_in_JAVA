import java.util.ArrayList;

public class PascleArray {
    public static void main(String[] args) {
        int n=5;
         ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

         // create triangle like 2D arraylist
        for(int i=0;i<n;i++){
            ArrayList<Integer> a = new ArrayList<>(); // khali
            for(int j=0;j<=i;j++){
                a.add(0);
            }
            arr.add(a);
        }
        
        // fill the values of pascal triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    arr.get(i).set(j,1);
                else{
                    int up = arr.get(i-1).get(j);
                    int upLeft = arr.get(i-1).get(j-1);
                    arr.get(i).set(j,up+upLeft);
                }
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
