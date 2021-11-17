package mainGame;

import gui_fields.*;

import java.awt.*;

public class Field {
    //Constructing fields of type Street, Chance, Jail and Parking
    private static final GUI_Field field1 = new GUI_Start(FieldConstants.START_NAME, FieldConstants.START_SUBTEXT, FieldConstants.START_DESCRIPTION, new Color(255, 0, 0), Color.WHITE);
    private static final GUI_Field field2 = new GUI_Street(FieldConstants.BURGER_NAME, FieldConstants.BURGER_SUBTEXT, FieldConstants.BURGER_DESCRIPTION, FieldConstants.BURGER_RENT, new Color(140, 43, 5), Color.WHITE);
    private static final GUI_Field field3 = new GUI_Street(FieldConstants.PIZZA_NAME, FieldConstants.PIZZA_SUBTEXT, FieldConstants.PIZZA_DESCRIPTION, FieldConstants.PIZZA_RENT, new Color(140, 43, 5), Color.WHITE);
    private static final GUI_Field field4 = new GUI_Chance(FieldConstants.CHANCE_NAME, FieldConstants.CHANCE_SUBTEXT, FieldConstants.CHANCE_DESCRIPTION, new Color(255, 220, 38), Color.WHITE);
    private static final GUI_Field field5 = new GUI_Street(FieldConstants.SWEET_NAME, FieldConstants.SWEET_SUBTEXT, FieldConstants.SWEET_DESCRIPTION, FieldConstants.SWEET_RENT, new Color(0, 197, 255), Color.WHITE);
    private static final GUI_Field field6 = new GUI_Street(FieldConstants.ICECREAM_NAME, FieldConstants.ICECREAM_SUBTEXT, FieldConstants.ICECREAM_DESCRIPTION, FieldConstants.ICECREAM_RENT, new Color(0, 197, 255), Color.WHITE);
    private static final GUI_Field field7 = new GUI_Jail("Jail.jpg", FieldConstants.JAIL_NAME, FieldConstants.JAIL_SUBTEXT, FieldConstants.JAIL_DESCRIPTION, new Color(125, 125, 125), Color.WHITE);
    private static final GUI_Field field8 = new GUI_Street(FieldConstants.MUSEUM_NAME, FieldConstants.MUSEUM_SUBTEXT, FieldConstants.MUSEUM_DESCRIPTION, FieldConstants.MUSEUM_RENT, new Color(151, 24, 255), Color.WHITE);
    private static final GUI_Field field9 = new GUI_Street(FieldConstants.LIBRARY_NAME, FieldConstants.LIBRARY_SUBTEXT, FieldConstants.LIBRARY_DESCRIPTION, FieldConstants.LIBRARY_RENT, new Color(151, 24, 255), Color.WHITE);
    private static final GUI_Field field10 = new GUI_Chance(FieldConstants.CHANCE_NAME, FieldConstants.CHANCE_SUBTEXT, FieldConstants.CHANCE_DESCRIPTION, new Color(255, 220, 38), Color.WHITE);
    private static final GUI_Field field11 = new GUI_Street(FieldConstants.SKATER_NAME, FieldConstants.SKATER_SUBTEXT, FieldConstants.SKATER_DESCRIPTION, FieldConstants.SKATER_RENT, new Color(255, 184, 0), Color.WHITE);
    private static final GUI_Field field12 = new GUI_Street(FieldConstants.POOL_NAME, FieldConstants.POOL_SUBTEXT, FieldConstants.POOL_DESCRIPTION, FieldConstants.POOL_RENT, new Color(255, 184, 0), Color.WHITE);
    private static final GUI_Field field13 = new GUI_Tax(FieldConstants.PARKING_NAME,FieldConstants.PARKING_SUBTEXT,FieldConstants.PARKING_DESCRIPTION,new Color(255, 255, 255), Color.BLACK);

    //GUI Field Array. The fields are shown in the order they are added in
    private static GUI_Field[] fields = new GUI_Field[]{
            field1,
            field2,
            field3,
            field4,
            field5,
            field6,
            field7,
            field8,
            field9,
            field10,
            field11,
            field12,
            field13
    };

    public static GUI_Field[] getFields() {
        return fields;
    }
}