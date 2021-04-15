package ru.inxt.urok4.Massivi.Sortirovka_Perestanovkoy;

import java.util.Arrays;

public class perestanovkaVmassive {

    public static void main(String[] args) {

                // сортировка массива методом  выбора-перестановки

        int[] mas = new int[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random()*10);
        }
        System.out.println("Исходный массив " + Arrays.toString(mas));

        for (int min = 0; min < mas.length; min++) {  //внешний цикл для перебора всех элементов
            System.out.println("mas ["+min+"] = "+mas[min]);
            int least = min;    // находим элемент для начала сортировки
            System.out.println(" \n min = "+min + "  ");
            for (int j = min+1; j < mas.length; j++) {
                 System.out.print("j=min+1 = " + j+ "  ");
                //внутренний цикл , находит индекс минималього элемента
                System.out.println("\nmas[j="+ mas[j]+"]        mas[least=" + mas[least]+"]");

                if (mas[j] < mas[least]) { // (mas[j] < mas[least]) сортировка наоборот
                    System.out.println("\nif  --> mas[j="+ mas[j]+"]    <    mas[least=" + mas[least]+"]");
                    least = j;  // присвоение наименьшего элемента иассива
                      System.out.println( "\nleast = mas [j="+ mas[j]+"]");
                }
            }
                    //  меняем местами
            System.out.println("\nmas[min]="+ mas[min]+"     mas[least]=" + mas[least]);

                int tmp = mas[min];
            System.out.println("tmp = " + tmp);
                mas[min] = mas[least];
            System.out.println("mas[min = " + mas[min]+"]");
                mas[least] =tmp;
            System.out.println("mas[least= " + mas[least]+"]");
        }
        System.out.println("Отсортированный  массив " + Arrays.toString(mas));


    }
}
