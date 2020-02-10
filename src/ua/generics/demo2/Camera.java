package ua.generics.demo2;

import java.util.Objects;

public class Camera extends Product {
    int pixel;

    public Camera(int pixel) {
        this.pixel = pixel;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camera camera = (Camera) o;
        return pixel == camera.pixel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pixel);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "pixel=" + pixel +
                '}';
    }
}
