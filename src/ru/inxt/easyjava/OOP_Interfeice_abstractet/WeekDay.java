package ru.inxt.easyjava.OOP_Interfeice_abstractet;

public enum WeekDay {

    MONDAY("Понедельник",1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда",3),
    THURSDAY("Четверг",4),
    FRIDAY("Пятница",5),
    SATURDAY("Суббота",6),
    SUNDAY("Воскресенье",7);

    private String rusName;
    private int number;

    WeekDay(String rusName, int number) {
        this.rusName = rusName;
        this.number = number;
    }
}
