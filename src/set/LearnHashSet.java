package set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    //duplicate elements not allowed
    // In hashset operation are in O(1)
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // every element has unique hash, duplicate elements can't be there
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}
