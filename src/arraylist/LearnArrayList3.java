package arraylist;

import java.util.ArrayList;

public class LearnArrayList3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Karan");
        list.add(294);
        list.add("Kanishk");
        list.add(782);
        list.add("Kunal");
        list.add(null);

        System.out.println(list);

        // set fn is used to update value
        // complexity is O(1)
        list.set(1, 54);
        list.set(0, 12);
        System.out.println(list);

        System.out.println(list.contains(504));
    }
}
