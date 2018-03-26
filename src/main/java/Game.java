import java.util.ArrayList;

public class Game {

    protected ArrayList<Object> players;

    public Game() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Object player) {
     players.add(player);
    }

}
