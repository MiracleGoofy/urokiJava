package ru.inxt.easyjava.OOP_igra.classees.Characters;

import ru.inxt.easyjava.OOP_igra.classees.CharacterClass;

public class Healer extends CharacterClass {

    public Healer(String name, String typePeron) {

        this.setMaxHealthPoints(50);
        this.setMaxManaPoints(150);
        this.setLevel(1);
        this.setHealthPoints(60);
        this.setManaPoints(150);
        this.setTypePerson(typePeron);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGED);
        this.setAttackAmount(2);

    }
}
