import com.thoughtworks.step.Player;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {
    @Test
    public void checkForPlayerName() {
        Player player1 = new Player("Aditi");
        assertThat(player1.getName(),is("Aditi"));
    }

    @Test
    public void checkForMoves() {
        Player player2 = new Player("Dhanashri");
        player2.addMove(1);
        assertThat(player2.getMoves(),hasItem(1));
    }
}
