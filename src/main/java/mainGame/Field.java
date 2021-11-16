package mainGame;

import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;

import java.awt.*;

public class Field {

    private static final GUI_Field field1 = new GUI_Start(FieldConstants.START_NAME, FieldConstants.START_SUBTEXT, FieldConstants.START_DESCRIPTION, new Color(255, 0, 0), Color.WHITE);
    private static final GUI_Field field2 = new GUI_Street(FieldConstants.BURGER_NAME, FieldConstants.BURGER_SUBTEXT, FieldConstants.BURGER_DESCRIPTION, FieldConstants.BURGER_RENT, new Color(140, 43, 5), Color.WHITE);
    private static final GUI_Field field3 = new GUI_Street(FieldConstants.PIZZA_NAME, FieldConstants.PIZZA_SUBTEXT, FieldConstants.PIZZA_DESCRIPTION, FieldConstants.PIZZA_RENT, new Color(140, 43, 5), Color.WHITE);
    private static final GUI_Field field4 = new GUI_Street(FieldConstants.SWEET_NAME, FieldConstants.SWEET_SUBTEXT, FieldConstants.SWEET_DESCRIPTION, FieldConstants.SWEET_RENT, new Color(0, 197, 255), Color.WHITE);
    private static final GUI_Field field5 = new GUI_Street(FieldConstants.ICECREAM_NAME, FieldConstants.ICECREAM_SUBTEXT, FieldConstants.ICECREAM_DESCRIPTION, FieldConstants.ICECREAM_RENT, new Color(0, 197, 255), Color.WHITE);

    private static GUI_Field[] fields = new GUI_Field[]{
            field1,
            field2,
            field3,
            field4,
            field5
    };


    public static GUI_Field[] getFields() {
        return fields;
    }

}