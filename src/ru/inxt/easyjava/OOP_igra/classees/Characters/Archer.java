package ru.inxt.easyjava.OOP_igra.classees.Characters;

import ru.inxt.easyjava.OOP_igra.classees.CharacterClass;

public class Archer extends CharacterClass {

    public Archer(String name, String typePeron) {

        this.setMaxHealthPoints(75);
        this.setMaxManaPoints(50);
        this.setLevel(1);
        this.setHealthPoints(75);
        this.setManaPoints(50);
        this.setTypePerson(typePeron);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(7);
    }
}
