package ru.inxt.easyjava.OOP_igra.classees.Characters;

import ru.inxt.easyjava.OOP_igra.classees.CharacterClass;

public class Warrior extends CharacterClass {

    public Warrior(String name, String typePeron) {

        this.setMaxHealthPoints(100);
        this.setMaxManaPoints(50);
        this.setLevel(1);
        this.setHealthPoints(100);
        this.setManaPoints(50);
        this.setTypePerson(typePeron);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(5);
    }
}
