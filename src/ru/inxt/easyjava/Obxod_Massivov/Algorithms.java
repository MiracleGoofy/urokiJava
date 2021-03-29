package ru.inxt.easyjava.Obxod_Massivov;

import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {

        int[] array = {5,48,55,64,89,47,52,51,414};
        sortBarrels(array);
        findMax(array);
//        int[][] matrix = new int [5] [5];
//        fillDiags(matrix);
    }

    public static void sortBarrels (int[] array) {

        int wintCount = 0;

        for (int i : array) {
            if(i%2 == 0) wintCount++;
        }

        int[] wineArray =  new int[wintCount];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                wineArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(wineArray));
    }

    public static void findMax(int[] array){

        int min = array[0], max = array[0];

        for (int i : array) {
            if(i<min) min = i;
            System.out.println("min - "+ min);
            System.out.println("i - min = " + i+"\n");
            if(i>max) max = i;
            System.out.println("max - "+ max);
            System.out.println("i - max = " +i +"\n");
        }
        System.out.println("max - " + max + "; min - " +min);
        System.out.println("Difference - " + (max - min)+ "\n\n");
    }


}
