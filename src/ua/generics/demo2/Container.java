package ua.generics.demo2;

//public class Container<T> {
//public class Container<T extends Product & Comparable<T>> { // allow object that extends
// Product and implements Comparable
public class Container<T extends Product> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

