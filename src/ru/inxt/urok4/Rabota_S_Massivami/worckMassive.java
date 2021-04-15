package ru.inxt.urok4.Rabota_S_Massivami;

import java.util.Arrays;
import java.util.Scanner;

public class worckMassive {

    public static void main(String[] args) {

        int min = -15;
        int maxs = 15;
        int iMas2 = 0;
        int pos [] = new int[10];
        int odd [] = new int[10];
       // int x = new Scanner(System.in).nextInt();
        int [] mainMas = new int[10];
        int[] mas1 = new int[mainMas.length/2];
        int[] mas2 = new int[mainMas.length/2];
        for (int i = 0; i < mainMas.length; i++) {
            mainMas[i] = (int) (Math.random()*((maxs-min)+1)+min);
            if(i<mainMas.length/2){
                mas1[i] = mainMas[i];
            } else {
                mas2[iMas2++] = mainMas[i];
            }
            if(mainMas[i] >0) {pos[i] = mainMas[i];}
            if(mainMas[i]%2 != 0)  odd[i] = mainMas[i];
        }

        System.out.println("Главный массив       "+ Arrays.toString(mainMas));
        System.out.println("первая половина      "+ Arrays.toString(mas1));
        System.out.println("вторая половина                             "+ Arrays.toString(mas2));
        System.out.println("Положительные числа  " + Arrays.toString(pos));
        System.out.println("Нечетные числа       " + Arrays.toString(odd));
    }
}
