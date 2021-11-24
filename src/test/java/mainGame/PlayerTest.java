package mainGame;

import dies.Die;
import gui_fields.GUI_Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerConstructorPosition() {

        GUI_Player gp = new GUI_Player("Test_Player");

        int startPosition = 10;
        Player p1 = new Player(startPosition, gp);

        //Test that player position is equal to start position for a player object that has not moved yet
        assertEquals(startPosition, p1.getPosition());

    }
}
