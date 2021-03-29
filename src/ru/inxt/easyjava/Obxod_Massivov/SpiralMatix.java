package ru.inxt.easyjava.Obxod_Massivov;

import static ru.inxt.urok0.PrintArray.PrintArray.printArray;

public class SpiralMatix {

    public static void main(String[] args) {

        int[][] matrixForSnail = new int[5][5];
        snaiMatrix(matrixForSnail);

    }

    public static void snaiMatrix(int[][] array){

        int a = 0;
        int n = array.length;
        int m;

        if(n%2 == 0) m = n/2;
        else m = (n+1)/2;

        for (int i = 0; i < m; i++) {
            for (int j = i; j < n-i; j++) {  // проход на право
                array[i][j] = a;
                a++;
            }
            for (int j = i+1; j < n-i; j++) { // проход в низ
                array[j][n-i-1] = a;
                a++;
            }
            for (int j = n-i-2; j >= i ; j--) { //  нпроход на лево
                array[n-i-1][j] = a;
                a++;
            }
            for (int j = n-i-2; j > i ; j--) { //проход в верх
                array[j][i] = a;
                a++;
            }
        }
        printArray(array);
    }
}

