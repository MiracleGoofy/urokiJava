package ru.inxt.urok4.Strings.StringBuffer;

import java.util.Scanner;

public class StringBuffers {

    public static void main(String[] args) {

        StringBuffer str1 = new StringBuffer("программа");
        StringBuffer str = new StringBuffer(str1);
        System.out.println(str);
        str1.delete(0, 3).deleteCharAt(5);
        System.out.println(str1);

        str.delete(0, 7).append(str);
        System.out.println(str);

    }
}
