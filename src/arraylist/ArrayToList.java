package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayToList {
    public static void main(String[] args) {

        //size is fixed
        String[] array = {"Java", "Python", "PHP", "C++"};
        System.out.println("Printing Array " + Arrays.toString(array));

        //Converting array to list
        List<String> list = new ArrayList<>();

        //size not fixed (contiguous fashion)
        for (String lang : array) {
            list.add(lang);
        }
        System.out.println("Printing List " + list);
    }
}
