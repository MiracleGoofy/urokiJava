package ru.inxt.easyjava.Princip_OOP.package1;

public class Mage extends Character {

    public Mage(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        super(attackType, healthPoints, manaPoints, attackAmount);

        this.playerClass = "Mage";
    }
}
