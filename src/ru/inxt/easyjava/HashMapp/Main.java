package ru.inxt.easyjava.HashMapp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        Integer integer = hashMap.put("A", 1);
        System.out.println(integer);

        Integer integer1 = hashMap.put("A", 2);
        System.out.println(integer1);
        Integer integer2 = hashMap.get("A");
        System.out.println(integer2);
        hashMap.put("B",3);
        hashMap.put("C", 4);
        hashMap.put("H", 5);
        System.out.println(hashMap);
        for (Map.Entry entry: hashMap.entrySet()){
            entry.getValue();
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "A");
        treeMap.put(10, "A");
        treeMap.put(2, "A");
        treeMap.put(22, "A");
        treeMap.put(3, "A");
        treeMap.put(133, "A");
        System.out.println(treeMap);

        TreeMap<Box, String> boxes = new TreeMap<>(new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o2.weight - o1.weight;
            }
        });
        boxes.put(new Box(5), "ID1");
        boxes.put(new Box(15), "ID1");
        boxes.put(new Box(3), "ID1");
        boxes.put(new Box(7), "ID1");
        boxes.put(new Box(11), "ID1");
        boxes.put(new Box(23), "ID1");
        System.out.println(boxes);


    }
}
