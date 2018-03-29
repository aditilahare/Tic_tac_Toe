package com.thoughtworks.step;

import java.util.ArrayList;

public class Game {

    protected ArrayList<Player> players;
    private int currentPlayerIndex = 0;
    private ArrayList<Number> allMoves;

    public Game() {
        this.players = new ArrayList<>();
        this.allMoves = new ArrayList<>();
    }

    public void addPlayer(Player player) {
     players.add(player);
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void changeCurrentPlayer() {
        currentPlayerIndex = 1 - currentPlayerIndex;
    }

    public void addCurrentPlayerMove(int move) {
        int currentPlayerIndex = getCurrentPlayerIndex();
        Player currentPlayer = players.get(currentPlayerIndex);
        currentPlayer.addMove(move);
        addMoves(move);
    }
    public void addMoves(int move){
        allMoves.add(move);
    }

    public ArrayList<Number> getAllMoves() {
        return allMoves;
    }
}