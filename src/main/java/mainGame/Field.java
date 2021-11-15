package mainGame;

import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;

import java.awt.*;

public class Field {

    private static final GUI_Field field1 = new GUI_Start(FieldConstants.START_NAME, FieldConstants.START_SUBTEXT, FieldConstants.START_DESCRIPTION, Color.RED, Color.WHITE);
    //private static final GUI_Field field2 = new GUI_Street(FieldConstants.BURGER_NAME, FieldConstants.BURGER_SUBTEXT, FieldConstants.BURGER_DESCRIPTION, FieldConstants.BURGER_RENT, Color.BLUE, Color.WHITE);

    private static GUI_Field[] fields = new GUI_Field[]{
            field1,

    };


    public static GUI_Field[] getFields() {
        return fields;
    }

}