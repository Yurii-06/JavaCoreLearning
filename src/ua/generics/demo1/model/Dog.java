package ua.generics.demo1.model;

public class Dog implements Pet {
    @Override
    public void makeVoice() {
        System.out.println("woof, woof!");
    }
}
