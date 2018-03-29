package com.thoughtworks.step;

import java.util.Scanner;

public class TicTacToe {
    private final static Game game = new Game();

    public static void addPlayers(){
        Scanner sc = new Scanner(System.in);
        for (int index = 1;index <= 2;index++){
            System.out.println("Please enter " + index + " player's name");
            String playerName = sc.nextLine();
            Player player = new Player(playerName);
            game.addPlayer(player);

        }

    }

    public static void main(String[] args) {
        addPlayers();
    }
}
