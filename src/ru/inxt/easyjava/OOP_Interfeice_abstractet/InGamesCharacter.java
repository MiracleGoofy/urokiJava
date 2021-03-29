package ru.inxt.easyjava.OOP_Interfeice_abstractet;

public abstract class InGamesCharacter {

    private int manaPoints;
    private int healthPoints;
    public abstract void attack();

    public int getManaPoints() {
        return manaPoints;
    }

    public void  setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
