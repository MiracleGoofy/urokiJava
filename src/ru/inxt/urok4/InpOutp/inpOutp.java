package ru.inxt.urok4.InpOutp;

import java.io.*;

public class inpOutp {

    public static void main(String[] args) {

        //  INPUT STREAM

        String text = "Hello World!!!\n";

        try {
            PrintStream prStr = new PrintStream("src/ru/inxt/urok4/InpOutp/stream.txt");
            prStr.print(text);
            prStr.print("text\n");
        //    System.out.println(prStr);
            prStr.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // OUTPUT STREAM

        String text1 = "Hello MAY !!";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/ru/inxt/urok4/InpOutp/stream.txt", true);
            byte buf[] =text1.getBytes();
            fileOutputStream.write(buf);
            System.out.println("Запись прошла успешно!");
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Неизвестная ошибка!");
            e.printStackTrace();
        }

    }
}
