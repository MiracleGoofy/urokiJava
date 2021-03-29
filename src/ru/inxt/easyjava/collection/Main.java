package ru.inxt.easyjava.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java!");
        arrayList.add(0, "I am the first!");
  //      System.out.println((arrayList));

        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("Start Test");
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long t = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(0,i);
        }
        System.out.println("Time: " +(System.currentTimeMillis()-t));
    }
}
