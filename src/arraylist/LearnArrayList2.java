package arraylist;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4); //This will add 4 at end of List
        list.add(3); //This will add 3 at end of List
        // We can add duplicate elements in list
        System.out.println(list);

        list.add(0, 0);
        //insert fn time complexity is O(n)
        //as we add element all other elements shift to right
        System.out.println(list);

        List<Integer> newList = new ArrayList();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(5));

        //Complexity is O(n) in remove fn as element shifts to left after removal
        list.remove(5); // This will remove element present at that particular index(position)
        System.out.println(list);

        list.remove(Integer.valueOf(150)); // This will remove element(objects) from list
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
