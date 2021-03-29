package ru.inxt.easyjava.Princip_OOP.package1;

public class Warrior  extends Character{

    public Warrior(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        super(attackType, healthPoints, manaPoints, attackAmount);

        this.playerClass = "Warrior";
        System.out.println("Warrior const: ");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("@ Warrior info: ");
    }
}
