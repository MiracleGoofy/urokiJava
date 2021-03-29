package ru.inxt.easyjava.OOP_Interfeice_abstractet;

public final class Dragon extends NPC implements iFlyable{
    @Override
    public void attack() {

        System.out.println("Dragon attack !!");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying!");
    }
}
