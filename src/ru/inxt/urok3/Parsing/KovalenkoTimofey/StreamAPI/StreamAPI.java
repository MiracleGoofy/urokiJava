package ru.inxt.urok3.Parsing.KovalenkoTimofey.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("00000");
        list.add("AAAA");
        list.add("1111");
        list.add("FFFF");
        list.add("44444");
        list.add("Wer TYU");

        list
                .stream()
                .limit(4)
                .filter(val-> !val.equals("1111"))
                .map(val -> val + " CV")
                .forEach(val ->System.out.println(val));
    }
}
