package ru.inxt.easyjava.collection;

import java.util.HashSet;

public class Main2 {

    public static void main(String[] args) {

        Box appleBox = new Box(5, "pink", "apples");
        Box orangeBox = new Box(5, "pink", "oranges");
        Box appleBox2 = new Box(5, "orange", "apples");
        Box appleBox3 = new Box(15, "orange", "apples");

        HashSet<Box> boxes  = new HashSet<>();
        boxes.add(appleBox);
        boxes.add(orangeBox);
        boxes.add(appleBox2);
        boxes.add(appleBox3);
        System.out.println(boxes);
    }
}