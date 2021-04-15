package ru.inxt.urok4.Massivi.Pabota_s_Maccivami;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] ZP = new int[8];
        int sum = 0;
        int min = 10000;
        int max = 0;
        for (int i = 0; i < ZP.length; i++) {
            ZP[i] = (int) (Math.random()*500)+200;
            sum +=ZP[i];

            if(ZP[i]<min)
                min = ZP[i];
            if(ZP[i]>max)
                max = ZP[i];


        }
        System.out.println(Arrays.toString(ZP));
        System.out.println("Итого: " + sum);
        System.out.println("Минимальная зарплата - "+ min);
        System.out.println("Максимальная зарплата - "+ max);
    }
}
