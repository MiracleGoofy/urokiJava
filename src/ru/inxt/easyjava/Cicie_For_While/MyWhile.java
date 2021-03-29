package ru.inxt.easyjava.Cicie_For_While;

public class MyWhile {

    static int characterHealth =400;
    static int maxHealth = 1000;

    public static void  main (String [] args) {

        boolean characterIsPoisoned = true;
        while(characterIsPoisoned) {
            decreaseHealth(5);
        }
        while(!characterIsPoisoned){
            if(characterHealth == maxHealth) break;
            increaseHealt(1);
        }
    }

    public static void decreaseHealth(int amount) {
        characterHealth -= amount;
    }
    public static void increaseHealt(int amount){
        characterHealth += amount;
    }

}
