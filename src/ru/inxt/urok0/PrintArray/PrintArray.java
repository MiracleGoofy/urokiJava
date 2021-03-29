package ru.inxt.urok0.PrintArray;

public class PrintArray {

    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
