package mainGame;

import gui_fields.GUI_Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {

    @Test
    public void testCorrectNumberOfFields() {
        //Test number of fields is exact 24
        assertEquals(24, Field.getFields().length);

    }

}