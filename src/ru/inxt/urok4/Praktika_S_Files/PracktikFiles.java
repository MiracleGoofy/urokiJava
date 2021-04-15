package ru.inxt.urok4.Praktika_S_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PracktikFiles {

    public static void main(String[] args) {

        String str = "";
        File fO = new File("src/ru/inxt/urok4/Praktika_S_Files/test.txt");
        try (FileInputStream isO = new FileInputStream(fO);) {
            System.out.println(fO.getName());
            int i = -1;
            while ((i = isO.read()) != -1) {
                str += (char)i;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException erro) {
            System.out.println("Неизвестная ошибка!");
            System.out.println(erro.getMessage());
        }
        System.out.println(str);

        String strBuf[] = str.split(";");
        for (String s : strBuf) {
            System.out.println(s);
            
        }
    }
}
