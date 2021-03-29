package ru.inxt.easyjava.Obxod_Massivov;

import static ru.inxt.urok0.PrintArray.PrintArray.printArray;

public class Diagonl_Matrix {

    public static void main(String[] args) {
        int [][] matrix = new int[5][5];
        fillDiags(matrix);

        int[][] matrix2 = new int [7][7];
        fillDiags2(matrix2);
    }

    // первый метод вычесления диоганали многомерного массива

    public static void fillDiags(int[][] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==j) array[i][j] =2;
                if(i+j == array.length-1) array[i][j] = 2;
            }
            printArray(array);
        }
    }

    //  короткий метод вычесления диоганали многомерного массива
    public static void fillDiags2 (int[][] array){

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length-1-i] = 1;
        }
        printArray(array);
    }








    // метод PRINT для красивого вывода многомерного массива в консоль

}
