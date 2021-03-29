package ru.inxt.easyjava.OOP_Interfeice_abstractet;

public interface iFlyable {

    void fly();
    default void hover(){
        System.out.println("I'm hovering!");
    }
}
