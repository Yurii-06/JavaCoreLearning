package ua.generics.demo3;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class CovariantCotrvariantDemo {
    public static void main(String[] args) {
        collectionContrvariance();

    }

    public static void arrayCovariance() {
        String[] strs = {"A", "B", "C"};
        Object[] objs = strs;

        System.out.println(objs[0]); // reading - OK
//        objs[0] = 1; // error - ArrayStoreException
    }

    // safe when reding
    // can cause errors when writing
    public static void collectionCovariance() {
        List<Integer> integers = null;
        List<Double> doubles = null;

//        List<? extends Number> numbers = integers;
        List<? extends Number> numbers = doubles;
    }

    // reading only via Object type
    // work for writing
    public static void collectionContrvariance() {

//        List<? super Number> numbers = new ArrayList<>();
//        numbers.add(new Object());

        Number aDouble = Double.valueOf(1.2);
        List<Number> numbers = new ArrayList<>();
        List<? super Integer> integerList = new ArrayList<>();
//        integerList.add(aDouble);

        integerList = numbers;
    }
}
