package ru.inxt.easyjava.OOP_igra;

import ru.inxt.easyjava.OOP_igra.classees.Characters.Archer;
import ru.inxt.easyjava.OOP_igra.classees.Characters.Healer;
import ru.inxt.easyjava.OOP_igra.classees.Characters.Mage;
import ru.inxt.easyjava.OOP_igra.classees.Characters.Warrior;
import ru.inxt.easyjava.OOP_igra.dungeons.Dungeon;

public class Main {

    public static void main(String[] args) {

        Party party = new Party(new Mage("Gandlf", "MAGE"),
                      new Warrior("Arragon", "WARRIOR"),
                      new Archer("Legolas", "ARCHER"),
                      new Healer("Radogast", "HEALER"));
        party.info();
        Dungeon dungeon = new Dungeon();
        if(party.enterDungeon(dungeon)){
            party.setDungeon(dungeon);
            party.runDungeon();
        }
        else System.out.println("GAME OVER!");
    }
}
