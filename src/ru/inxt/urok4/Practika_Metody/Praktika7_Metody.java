package ru.inxt.urok4.Practika_Metody;

public class Praktika7_Metody {

    public static void main(String[] args) {

        int [] rndMas = new int[15];
        int min = 1;
        int maxs = 10;
        rndMas = fillMas(rndMas, min, maxs);
        for (int i = 0; i < rndMas.length; i++) {
            System.out.print(rndMas[i] + " | ");
        }

    }

    public static int[] fillMas(int mas[], int min, int maxs){

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random()*((maxs-min)+1))+min;
        }
        return mas;
    }
}
