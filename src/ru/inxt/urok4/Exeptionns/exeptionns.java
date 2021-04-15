package ru.inxt.urok4.Exeptionns;

import java.util.Scanner;

public class exeptionns {

    public static void main(String[] args) {

//        int x  = new Scanner(System.in).nextInt();
//        int y = new Scanner(System.in).nextInt();
//        try {
//            double res = x/y;
//            System.out.println(res);
//        } catch (Exception myErr){
//            // System.out.println("Делить на 0 нельзя");
//             System.err.println(myErr);
//        }
//        System.out.println("Завершение программы 1");

        int []  mas = {7,9,5,21,548};
        try{
            System.out.println(mas[9]);
        } catch (ArrayIndexOutOfBoundsException myErro){
            System.out.println(myErro.getMessage());
        }
        System.out.println("Завершение программы 2");


    }

}
