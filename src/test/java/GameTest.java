import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameTest {
    @Test
    public void addPlayer() {
        Game game = new Game();
        Player player1 = new Player("Aditi");
        game.addPlayer(player1);
        assertThat(game.players,hasItem(player1));
    }

    @Test
    public void getCurrentPlayer() {
        Game game = new Game();
        int currentPlayer = game.getCurrentPlayer();
        assertThat(currentPlayer,is(0));
    }

    @Test
    public void changeCurrentPlayer() {
        Game game = new Game();
        game.changeCurrentPlayer();
        assertThat(game.getCurrentPlayer(),is(1));
    }
}
