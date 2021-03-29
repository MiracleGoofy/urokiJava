package ru.inxt.easyjava.Princip_OOP.package2;

import ru.inxt.easyjava.Princip_OOP.package1.Mage;
import ru.inxt.easyjava.Princip_OOP.package1.Potion;
import ru.inxt.easyjava.Princip_OOP.package1.Warrior;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("close", 500, 100, 75);
        warrior.attackAmount = 100;
        warrior.info();

        Mage mage = new Mage("ranged", 300, 500, 150);
        warrior.attack(mage);

        Potion hp = new Potion("health", 500, "minor", "blue");
        Potion hp2 = new Potion("health", 500, "minor", "red");

        System.out.println(hp == hp2);
        System.out.println(hp.equals(hp2));
        System.out.println("\n" + hp.hashCode());
        System.out.println(hp2.hashCode() + "\n");
        System.out.println(hp);

    }
}

