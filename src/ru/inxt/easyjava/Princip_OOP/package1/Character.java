package ru.inxt.easyjava.Princip_OOP.package1;

public class Character {

    public String attackType;
    public int healthPoints;
    private int manaPoints;
    public int attackAmount;
    protected String playerClass;

    public Character(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        this.attackType = attackType;
        this.healthPoints = healthPoints;
      //  this.manaPoints = manaPoints;
        setManaPoints(manaPoints);
        this.attackAmount = attackAmount;
        System.out.println("Caracter const: ");
    }

    public void restoreHealth(int amount){
        this.healthPoints += amount;
    }
    public void reduceHealth(int amount){
        this.healthPoints -= amount;
    }
    public void restoreMana(int amount){
        this.manaPoints +=amount;
    }
    public void reduceMana(int amount) {
        this.manaPoints -= amount;
    }
    public void attack(Character c){
        c.reduceHealth(this.attackAmount);
        System.out.println(this.playerClass + " * attacked * " + c.playerClass + " - for - " + this.attackAmount) ;
    }
    public void info(){
        System.out.println(this.healthPoints + " " + this.manaPoints);
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        if(manaPoints < 0) this.manaPoints = 0;
        this.manaPoints = manaPoints;
    }
}
