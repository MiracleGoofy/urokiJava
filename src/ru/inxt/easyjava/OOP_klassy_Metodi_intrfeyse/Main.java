package ru.inxt.easyjava.OOP_klassy_Metodi_intrfeyse;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("xxNagobatorxx", 1, "Warrior");

        int a = 3;
        int b = a;
        b+=4;
        System.out.println("A: " + a + "\nB: " + b);

        Player player1 = player;
        player1.playerName = "Mario";

        System.out.println("Player: "+ player.playerName + "\nPlayer1: " +
                player1.playerName);

        Player player2 = new Player("Cooler");
        player.info();
        Player.info(player2);

        System.out.println("Player count: " + Player.playerGount);
    }
}
