import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);
        list3.add(15);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(list1);
        arr.add(list2);
        arr.add(list3);

        // System.out.println(arr);

        // using for loop
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

        // using for each loop
        for(ArrayList<Integer> list:arr){
            for(int e:list){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
