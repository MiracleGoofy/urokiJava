package ru.inxt.easyjava.Princip_OOP.package1;

import java.util.Objects;

public class Potion {

    public String type;
    public int volume;
    public String stregth;
    public String color;

    public Potion(String type, int volume, String stregth, String color) {
        this.type = type;
        this.volume = volume;
        this.stregth = stregth;
        this.color = color;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Potion)) return false;
        Potion potion = (Potion) o;
        return volume == potion.volume && Objects.equals(type, potion.type) && Objects.equals(stregth, potion.stregth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, volume, stregth);
    }

    @Override
    public String toString() {
        return "Potion{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                ", stregth='" + stregth + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
