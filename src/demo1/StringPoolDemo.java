package demo1;

import java.util.WeakHashMap;

public class StringPoolDemo {
    public static void main(String[] args) {
        String cat = "cat"; // in string pool
        String cat2 = "cat"; // in string pool
        String cat3 = new String("cat"); // in heap memory space

        System.out.println(cat == cat2);
        System.out.println(cat == cat3);

    }
}
