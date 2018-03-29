package com.thoughtworks.step;

import java.util.Scanner;

public class TicTacToe {
    private final static Game game = new Game();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first player's name");
        String firstPlayer = sc.nextLine();
        System.out.println("Welcome " + firstPlayer);
        System.out.println("Please enter second player's name");
        String secondPlayer = sc.nextLine();
        System.out.println("Welcome " + secondPlayer);
        Player first = new Player(firstPlayer);
        Player second = new Player(secondPlayer);
        game.addPlayer(first);
        game.addPlayer(second);
    }
}
