package ru.inxt.urok4.Strings.StringBuilders;

import java.util.Scanner;

public class StringBuilders {

    public static void main(String[] args) {

        String name1 = new Scanner(System.in).nextLine();
        String name2 = new Scanner(System.in).nextLine();

        if (name1.equals(name2)) System.out.println("Равны");
            else System.out.println("Неравны");
    }
}
