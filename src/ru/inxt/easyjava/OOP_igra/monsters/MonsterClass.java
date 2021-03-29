package ru.inxt.easyjava.OOP_igra.monsters;

import ru.inxt.easyjava.OOP_igra.classees.BaseClass;
import ru.inxt.easyjava.OOP_igra.classees.Characters.AttackType;

public class MonsterClass implements BaseClass {

    private int manaPoints;
    private int level;
    private AttackType attackType;
    private int attackAmount;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;
    private String typePerson;

    @Override
    public void attack() {

    }

    @Override
    public void restoreHealth(int amount) {

    }

    @Override
    public void loseHealath(int amount) {

    }

    @Override
    public void restoreMana(int amount) {

    }

    @Override
    public void loseMana(int amount) {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {

    }
}
