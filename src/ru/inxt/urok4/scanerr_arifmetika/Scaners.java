package ru.inxt.urok4.scanerr_arifmetika;

import javax.swing.*;
import java.util.Scanner;

public class Scaners {

    public static void main(String[] args) {

//        System.out.print("Введите значение - ");

//        Scanner read = new Scanner(System.in);

//        int ms = read.nextInt();

//        int ms = new Scanner(System.in).nextInt();
//        String str = new Scanner(System.in).nextLine();

        Integer txt = Integer.valueOf(JOptionPane.showInputDialog(""));
             int one =  txt/10;
        int two = txt%10;
        int result = one + two;
        JOptionPane.showMessageDialog(null, result);
        System.out.println("Значение первой переменной = " + result);
        Integer txt1 = Integer.valueOf(JOptionPane.showInputDialog(""));
        int one1 =  txt1/10;
        int two1 = txt1%10;
        one1++;
        two1--;
        int result1 = one1 + two1;
        System.out.printf("%s - Значение первой переменной,%s - Значение второй переменной",one1, two1);

        JOptionPane.showMessageDialog(null, result1);
        System.out.printf("\n%s - Значение второй переменной",result1);

//        int year = 2010;
//        String nameF = "SoftMarket";
//
//        System.out.printf("Название фирмы - %s,\n основанна в %sг ", nameF, year);
    }

}
