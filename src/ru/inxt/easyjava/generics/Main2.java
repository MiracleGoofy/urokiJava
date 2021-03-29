package ru.inxt.easyjava.generics;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

        copyElements(integers, numbers);
    //    copyElements(integers, doubles); разные классы; Dooble не является родительским классом для Integer
    //    copyElements(numbers, integers);  разные классы; Numbers не является родительским классом
        copyElements(doubles, numbers);
    //    copyElements(strings, integers); разные классы; Stringe не является родительским классом
    }
    public static <T> void copyElements(ArrayList<? extends T> src,
                                        ArrayList<? super T> dst){
        for (int i = 0; i < src.size(); i++) {
            dst.add(src.get(i));
        }
    }
}
