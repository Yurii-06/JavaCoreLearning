package ua.generics.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // == demo 1 ==
        Container<Product> c1 = new Container<>();
        c1.setItem(new Camera(12));
        c1.setItem(new Phone("Motorolla"));

        Phone motorolla = new Phone("Motorolla");
        Camera camera = new Camera(12);
//        List<Product> products = Arrays.asList(new Camera(12), new Phone("Motorolla"));
        List<Camera> cameras = Arrays.asList(new Camera(12), new Camera(16));
        List<Phone> phones = Arrays.asList(new Phone("Motorolla"), new Phone("Alcatel"));

//        Container<String> c2 = new Container<>();

        // == demo 2 ==

//        boolean b = find(cameras, camera);
        boolean b = find(phones, motorolla);
        System.out.printf("result: %s\n", b);

        // == demo 3 ==
        ArrayList<Product> dest = new ArrayList<>();
        List<Product> src = Arrays.asList(new Camera(12), new Camera(16));
        copy(src, dest);
        dest.forEach(System.out::println);
    }

    //    public static <T extends Product> boolean find(List<T> all, T p) {
    public static boolean find(List<? extends Product> all, Product p) {
        boolean isFound = false;
        for (Product product : all) {
            if (product.equals(p)) {
                isFound = true;
            }
        }

        return isFound;
    }

    public static void copy(List<? extends Product> src, List<? super Product> dest) {
        for (Product product : src) {
            dest.add(product);
        }
    }


}
