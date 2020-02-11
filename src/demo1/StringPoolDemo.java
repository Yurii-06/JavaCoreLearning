package demo1;

import java.util.WeakHashMap;
import java.io.FileNotFoundException;
import java.util.function.*;

import java.awt.*;
import java.util.*;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StringPoolDemo {

    public static void main(String[] args) {
//        String cat = "cat"; // in string pool
//        String cat2 = "cat"; // in string pool
//        String cat3 = new String("cat"); // in heap memory space
//
//        System.out.println(cat == cat2);
//        System.out.println(cat == cat3);
//
//         int[] arr = {1 , 2, 4, 5, 6, 7, 19, 1};
////        splitByTwo(arr);
//
//        deleteDuplicate();
//        System.out.println(closureDemo(5));
//
//        String suffix = "dfd";
//        String prefix = "dfd";
//        String x = " dfd ";
//        String s = suffix + x.trim() + prefix;
//        System.out.println(s);
//        hashMapDemo();



        try {
            v();
        } catch (FileNotFoundException e) {
            v();
        } finally {
            throw new RuntimeException();
        }
    }



    public static void v() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void preIncrementAndPostIncrementDemo() {
        int i = 0;
        int[] intArry = {1, 2, 4};
        System.out.println(intArry[i++]);

        i = 0;
        System.out.println(intArry[++i]);
    }

    public static void reduceDemo() {
//        BiFunction<Long, Long, Long> biFunction = (Long start, Long end) -> LongStream.range(start, end + 1).reduce(1, (acc, x) -> acc * x);
        BiFunction<Long, Long, Long> biFunction =
                (Long start, Long end) -> LongStream.rangeClosed(start, end).reduce(1, (acc, x) -> acc * x);

        Long apply = biFunction.apply(1L, 4L);
        System.out.println(apply);
        long reduce = LongStream.range(1, 4 + 1).reduce(1, (acc, x) -> acc * x);
        System.out.println(reduce);
    }


    public static void deleteDuplicate() {
        List<String> strings = Arrays.asList("java", "scala", "java", "clojure", "clojure");

        List<String> collect = strings.stream().distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


    public static double closureDemo(int inValue) {
        double a = 1.2;
        double b = 1.7;
        double c = 1.9;
        IntFunction<Double> f = (x) -> a + x * x + b + c;
        return f.apply(inValue);
    }


    // int[] arr = {1 , 2, 4, 5, 6, 7, 19, 1};
    public static void splitByTwo(int[] inArray) {
        int length = inArray.length;

        if (length == 1) return;
        else {
            int half = inArray.length / 2;
            System.out.printf("half: %s\n", half);
            int[] firstPart = new int[half];
            System.arraycopy(inArray, 0, firstPart, 0, half);

            int[] secondPart = new int[half];
            System.arraycopy(inArray, half, secondPart, 0, half);

            System.out.println(Arrays.toString(firstPart));
            System.out.println(Arrays.toString(secondPart));

            splitByTwo(firstPart);
            splitByTwo(secondPart);
        }
    }
}

@interface CustomAnnotation {

}
