import com.thoughtworks.step.Game;
import com.thoughtworks.step.Player;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {
    private Game game;
    private Player player1;
    private Player player2;

    @Before
    public void setUp() {
        game = new Game();
        player1 = new Player("Aditi");
        player2 = new Player("Sayima");
        game.addPlayer(player1);
        game.addPlayer(player2);
    }

    @Before

    @Test
    public void addPlayer() {
        assertThat(game.players,hasItem(player1));
    }

    @Test
    public void getCurrentPlayer() {
        Game game = new Game();
        int currentPlayer = game.getCurrentPlayerIndex();
        assertThat(currentPlayer,is(0));
    }

    @Test
    public void changeCurrentPlayer() {
        Game game = new Game();
        game.changeCurrentPlayer();
        assertThat(game.getCurrentPlayerIndex(),is(1));
    }

    @Test
    public void addCurrentPlayerMove() {
        game.addCurrentPlayerMove(2);
        assertThat(game.players.get(0).moves,hasItem(2));
    }

    @Test
    public void getAllMoves() {
        game.addCurrentPlayerMove(2);
        game.addCurrentPlayerMove(3);
        game.addCurrentPlayerMove(1);
        assertThat(game.getAllMoves(),hasItems(2,3,1));
    }
}
