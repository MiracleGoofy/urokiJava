package ru.inxt.easyjava.collection;

import java.util.Objects;

public class Box {
    private int weight;
    private String  color;
    private String content;

    public Box(int weight, String color, String content) {
        this.weight = weight;
        this.color = color;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return weight == box.weight && Objects.equals(content, box.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, content);
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", content='" + content + '\'' +
                '}'+ '\n';
    }
}
