package ru.inxt.urok4.Massivi.PereborMassiv;

import java.util.Arrays;

public class Massives {

    public static void main(String[] args) {

        //   Заполнение массива

//        int[] mas = new int[6];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = i;
//            mas[i] = (int) (Math.random()*10);
//            System.out.println(mas[i]);
//        }

        // Перебор массива по порядку

//        int mas[] = {20,3,5,87,6,41,125};
//            for (int ma : mas) {
//                System.out.print(ma+ " ");
//
//            }

        // Перебор массива по порядку без цикла

        int mas[] = {20,3,5,87,6,41,125};
        System.out.println(Arrays.toString(mas));

        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.print(sum+"  ");
        }
        System.out.println("\nСредне арифметическое от 1 до 10 = " + sum/10);

    }
}
