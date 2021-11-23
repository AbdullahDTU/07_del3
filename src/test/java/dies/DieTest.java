package dies;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    public void testDieSidesConstructor() {
        int sides = 6;

        // Construct a Die object
        Die die = new Die(sides);

        // Check to see if the die has the expected number of sides
        assertEquals(die.getFaceValue(), sides);
    }
}
