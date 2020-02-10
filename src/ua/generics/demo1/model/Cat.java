package ua.generics.demo1.model;

public class Cat implements Pet {
    @Override
    public void makeVoice() {
        System.out.println("meow, meow!");
    }
}
