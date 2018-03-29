package com.thoughtworks.step;

import java.util.ArrayList;

public class Player {
    private final String name;
    protected ArrayList<Number> moves;

    public Player(String name) {
        this.name = name;
        this.moves = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Number> getMoves() {
        return this.moves;
    }

    public void addMove(int move) {
        moves.add(move);
    }
}
