package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list); // this invokes toString method of that list (arraylist in this case)

        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element is " + list.get(i));
        }

        for (Integer element : list) {
            System.out.println("For each element is " + element);
        }

        //Iterator
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }
    }
}
