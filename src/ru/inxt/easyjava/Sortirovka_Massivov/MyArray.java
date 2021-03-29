package ru.inxt.easyjava.Sortirovka_Massivov;

import java.util.Arrays;

public class MyArray {

    public static void main(String[] args) {
        int[] array= {25,15,98,30,12};
        bubbleSort(array);
        bubbleSortDesc(array);
    }

    public static void bubbleSort(int[] array){

        System.out.println("----------------------------------------------\n " +
                "arrays --" + Arrays.toString(array)+
                "\n--------------   Before  ---------------------");

        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println("i++ = " + array[i]);
            for (int j = 0; j < i; j++) {
                System.out.println("j++ = " + array[j]);
                if (array[j] > array[j+1]){
                    System.out.println("array[j] > array[j+1] -- "+array[j]+ " - " + array[j+1]);
                    System.out.println("arrays " + Arrays.toString(array) );
                    int temp = array[j];
                    System.out.println("temp = array[j] -- "+temp);
                    System.out.println("arrays " + Arrays.toString(array) );
                    array[j] = array[j+1];
                    System.out.println("array[j] = array[j+1] -- "+array[j]);
                    System.out.println("arrays " + Arrays.toString(array) );
                    array[j+1] = temp;
                    System.out.println("array[j+1] = temp -- "+array[j+1]);
                    System.out.println("arrays " + Arrays.toString(array) );
                }
            }
        }
        System.out.println("----------------------------------------------\n arrays --" +
                Arrays.toString(array)+
                "\n--------------   After  ---------------------");
    }

    public static void bubbleSortDesc (int[ ] array){
        System.out.println("----------------------------------------------\n " +
                "arrays --" + Arrays.toString(array)+
                "\n--------------   Before  ---------------------");

        for (int i = 0; i < array.length-1; i++) {
            System.out.println("i++ =  array[" +i + "] = " + array[i]);
            for (int j = i+1; j < array.length; j++) {
                System.out.println("j= i+1 = array[" + j+"]= " + array[j]);
                System.out.println("befor -->>   array["+i+"] < array["+j+"] -- "+array[i]+ " < " + array[j]);
                if(array[i] < array[j]){
                    System.out.println("array["+i+"] < array["+j+"] -- "+array[i]+ " < " + array[j]);
                    System.out.println("arrays " + Arrays.toString(array) );
                    int temp = 0;
                    System.out.println("temp = "+temp);
                    temp= array[i];
                    System.out.println("temp "+temp+" = array["+i+"] = "+array[i]);
                    System.out.println("arrays " + Arrays.toString(array) );
                    array[i] = array[j];
                    System.out.println("array["+i+"] = array["+j+"] -- "+array[j]);
                    System.out.println("arrays " + Arrays.toString(array) );
                    array[j] = temp;
                    System.out.println("array["+j+"] = temp -" +temp);
                    System.out.println("arrays " + Arrays.toString(array) );
                }
                System.out.println("after -->>   array["+i+"] < array["+j+"] -- "+array[i]+ " < " + array[j]+"\n");

            }
        }
        System.out.println("----------------------------------------------\n arrays --" +
                Arrays.toString(array)+
                "\n--------------   After  ---------------------");
        ;
    }
}
