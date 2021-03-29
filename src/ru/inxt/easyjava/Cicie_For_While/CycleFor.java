package ru.inxt.easyjava.Cicie_For_While;

import java.util.Arrays;

public class CycleFor {

    public static void main(String[] args){

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        for(int i = 0, j= 10; i<j; i++, j-- )
//            System.out.println(i+"  "+j);
//
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//                System.out.println(i+ "  " + j);
//            }
//        }

        int [] levels = new int[10];

        for (int i = 0; i < levels.length; i++) {
            levels[i] = i+1;
        }
        System.out.println(Arrays.toString(levels));

        
        int [] [] matrix = new int[5][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int [] rewards = {30,20,50};
        int sum = 0;
        for (int reward : rewards) {
            sum += reward;
        }
        System.out.println("rewards = " + sum);


        int [] test= {4,5,10};
        for (int i : test) {
            i = 0;
        }
        System.out.println(Arrays.toString(test));


    }
}
