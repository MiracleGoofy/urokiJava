package ru.inxt.easyjava.HashMapp;

import java.util.Objects;

public class Box {

    int weight;

    public Box(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return weight == box.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                '}'+"\n";
    }
}
