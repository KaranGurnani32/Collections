package stack;

public class Instance {
    //Not in collections

    public String name = "Karan";
    public static int age = 10;


    public static void run() {
        age = age + 10;
        System.out.println(age);
    }
    public static void run2() {
         age = age + 10;
        System.out.println(age);
    }


    public static void main(String[] args) {
        System.out.println(age);
        run();
        run2();
    }
}
