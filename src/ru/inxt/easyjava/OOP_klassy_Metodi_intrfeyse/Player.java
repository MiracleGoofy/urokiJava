package ru.inxt.easyjava.OOP_klassy_Metodi_intrfeyse;

public class Player {

    public String playerName;
    public int playerLevel;
    public String playerClass;
    public static int playerGount;

    public Player(String playerName, int playerLevel, String playerClass) {
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        this.playerClass = playerClass;
        playerGount++;
    }

    public Player(String playerName) {
        this.playerName = playerName;
        playerGount++;
    }

    public Player(int playerLevel) {
        this.playerLevel = playerLevel;
        playerGount++;
    }

    public Player() {
    }

    public Player(String playerName, int playerLevel) {
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        playerGount++;
    }

    public Player(int playerLevel, String playerClass) {
        this.playerLevel = playerLevel;
        this.playerClass = playerClass;
        playerGount++;
    }

    public void info(){
        System.out.println("Player info: " + this.playerName + " " + this.playerLevel +
                            " " + this.playerClass) ;
    }
    public static void info (Player player){
        System.out.println("Player info: " + player.playerName + " " + player.playerLevel +
                " " + player.playerClass) ;
    }
}
