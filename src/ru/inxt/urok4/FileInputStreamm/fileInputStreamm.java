package ru.inxt.urok4.FileInputStreamm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class fileInputStreamm {

    public static void main(String[] args) {

        //  Вывод в консоль из файла

//        StringBuffer sttr = new StringBuffer();
//
//        try {
//            FileInputStream inputStream = new FileInputStream("src/ru/inxt/urok4/InpOutp/stream.txt");
//            int i = -1;
//            while ((i = inputStream.read()) != -1){
//              //  System.out.print((char) i);
//                sttr.append((char) i);
//            }
//            inputStream.close();
//        } catch (FileNotFoundException e) {
//            System.err.println("Файл не найден");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("Неизвестная ошибка!");
//            e.printStackTrace();
//        }
//          System.out.print(sttr);


        //укороченный код

        try {
            Scanner scl = new Scanner(new File("src/ru/inxt/urok4/InpOutp/stream.txt"));
        String x = scl.nextLine();
            System.out.println(x);
            scl.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
