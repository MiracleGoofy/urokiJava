package ru.inxt.easyjava.OOP_igra;

import ru.inxt.easyjava.OOP_igra.classees.CharacterClass;
import ru.inxt.easyjava.OOP_igra.dungeons.Dungeon;

public class Party {

    private Dungeon dungeon;
    private CharacterClass[] partyMembers;
    public Party(CharacterClass... members){
        partyMembers = new CharacterClass[members.length];
        for (int i = 0; i < partyMembers.length; i++) {
            partyMembers[i] = members[i];
        }
    }

    public boolean enterDungeon(Dungeon dungeon){
        return dungeon.open(this);
    }

    public void runDungeon(){

    }
    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }

    public void info(){
        for (CharacterClass partyMember : partyMembers) {
            partyMember.info();
        }
    }

    public Dungeon getDungeon() {
        return dungeon;
    }

    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
}
