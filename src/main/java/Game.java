import java.util.ArrayList;

public class Game {

    protected ArrayList<Player> players;
    private int currentPlayerIndex = 0;

    public Game() {
        this.players = new ArrayList<>();
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
    }

    public void addCurrentPlayerMove(int move) {
        int currentPlayerIndex = getCurrentPlayerIndex();
        Player currentPlayer = players.get(currentPlayerIndex);
        currentPlayer.addMove(move);
    }
}