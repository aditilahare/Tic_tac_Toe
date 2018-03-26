import java.util.ArrayList;

public class Game {

    protected ArrayList<String> players;

    public Game() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(String name) {
     players.add(name);
    }

}
