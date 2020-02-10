package ua.generics.demo2;

import java.util.Objects;

public class Phone extends Product {
    String model;

    public Phone(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
