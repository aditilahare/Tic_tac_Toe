import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {
    @Test
    public void checkForPlayerName() {
        Player player1 = new Player("Aditi");
        assertThat(player1.getName(),is("Aditi"));
    }
}
