import java.util.ArrayList;

public class Game {

    protected ArrayList<Object> players;
    private int currentPlayer = 0;

    public Game() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Object player) {
     players.add(player);
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }
}
