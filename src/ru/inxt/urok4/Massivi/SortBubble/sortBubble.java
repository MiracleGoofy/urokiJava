package ru.inxt.urok4.Massivi.SortBubble;

import java.util.Arrays;

public class sortBubble {

    public static void main(String[] args) {

            // создание несортированного массива с рандомными знаычениями
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) ((Math.random())*10);
        }
        System.out.println("Несортированный массив " + Arrays.toString(mas));

          //   сортировка массива методом пузырька
        int c = 0;
        for (int i = 0; i < mas.length; i++) {
            c++;
            for (int j = 0; j < mas.length-1; j++) {
                if(mas[j] > mas[j+1]){
                  int tmp = mas[j];
                  mas[j] = mas[j+1];
                  mas[j+1] = tmp;
                }
            }
            System.out.println(c+" сортировка массива 1 " + Arrays.toString(mas));

        }
        System.out.println("Отсортированный массив 1 - " + Arrays.toString(mas));

        // создание несортированного массива с рандомными знаычениями

        int[] mas1 = new int[10];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) ((Math.random())*10);
        }
        System.out.println("\nНесортированный массив 2 " + Arrays.toString(mas1));

        // быстрая сортировка массива

        boolean statusSort = false;
        int r = 0;
        while (!statusSort){
            r++;
            statusSort = true;
            for (int i = 0; i < mas1.length-1; i++) {
                if(mas1[i]>mas1[i+1]){
                    statusSort = false;
                    int tmp = mas1[i];
                    mas1[i] = mas1[i+1];
                    mas1[i+1] = tmp;
                }
            }
            System.out.println(r+ " -сортировка массива 2 " + Arrays.toString(mas1));
        }
       System.out.println("Отсортированный массив 2 - " + Arrays.toString(mas1));

    }
}
