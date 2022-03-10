package arraylist;

import java.util.ArrayList;

public class LearnArrayList {

    public static void main(String[] args) {
//        String[] studentsName = new String[30];
//
//        studentsName[0] = "Karan";
          //
          // studentsName[1].....studentsName[28]
          //
//        studentsName[29] = "Kanishk";
//        studentsName[30] = "Kunal"; // It gives out of bound exception
          //Changing the size of array is not scalable solution
          //Solution is Array list class which uses array internally
          // It increases and decreases the size of array by itself

        ArrayList<String> studentsName = new ArrayList<>(); //Empty ArrayList is created
        //We didn't define any size it will check itself if it needs to increase size of list
        //in an optimized way
        studentsName.add("Karan");
        //if size = n
        //it increases size = n + n/2 + 1;
     }
}
