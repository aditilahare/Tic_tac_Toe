import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

public class GameTest {
    @Test
    public void addPlayer() {
        Game game = new Game();
        Player player1 = new Player("Aditi");
        game.addPlayer(player1.getName());
        assertThat(game.players,hasItem("Aditi"));
    }

}
