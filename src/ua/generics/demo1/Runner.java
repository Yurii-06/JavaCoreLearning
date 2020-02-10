package ua.generics.demo1;

import ua.generics.demo1.model.Cat;
import ua.generics.demo1.model.Dog;
import ua.generics.demo1.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Pet> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Dog());

//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());

//        callPets(cats);

        List<? super Pet> pets = new ArrayList<>();
//        pets = cats;


        // == demo 1 ==
        addPets(cats); // ???

        List rawList = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        rawList = list;
        rawList.add(8);
    }

//    public static void countPets(List<Pet> pets) { // can't do like this
//    T extends Pet  == kind of Producer (produce data for reading)
    public static <T extends Pet>void callPets(List<T> pets) {
//    public static void callPets(List<? extends Pet> pets) {
        for (Pet pet : pets) {
            pet.makeVoice();
        }
    }

    //    ? super Pet  == kind of Producer (produce data for reading)
    public static void addPets(List<? super Pet> pets) {
        pets.add(new Cat());
        pets.add(new Cat());
        System.out.printf("pets amount: %s\n", pets.size());
    }

//    public static <T extends Pet>void callPets(List<T> pets) {
//        for (Pet pet : pets) {
//            pet.makeVoice();
//        }
//    }


}
