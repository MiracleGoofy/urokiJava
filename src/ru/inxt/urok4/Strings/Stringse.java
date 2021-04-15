package ru.inxt.urok4.Strings;

public class Stringse {

    public static void main(String[] args) {

            // Конкантенация строк длина строки
        String st = "Study ";
        String st1 = "Java";
        String st3 = st.concat(st1);
        System.out.println(st3.charAt(3));
        System.out.println(st3+ " \n" + st3.length());

                // сравнение строк без учета регистра
        String st4 = "Вова";
        String st5 = "вова";
        if (st4.equalsIgnoreCase(st5))
            System.out.println(st4 + " - равна строке без учета регистра - " + st5);
        else
            System.out.println(st4 + " - не равна строке - " + st5);

            // кдаление пробелов в начале и конце строки
        String st6 = " Вова ";
        String st7 = " вова ";
            System.out.println(st6+"\n"+st7.trim());

            // перевдо строки в нижний регистр
        String st8 = " Вова ";
        System.out.println(st8.toLowerCase());

        // перевдо строки в верхний регистр
        String st9 = " ВоВа ";
        System.out.println(st8.toUpperCase());

                // посимвольный вывод на экран
        String str = "I'm study JAVA";
        int countA = 0;
        for (char i : str.toCharArray()) {
            System.out.println(i);
            if(i=='A') countA++;
        }
        System.out.println("\nКоличество букв А - " + countA);


    }
}
