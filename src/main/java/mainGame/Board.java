package mainGame;

import gui_fields.*;

import java.awt.*;
import java.util.ArrayList;

public class Board {

    //Makes arraylist of type GUI Fields
    GUI_Field[] fields = new GUI_Field[24];

    public GUI_Field[] getFields() {
        return fields;
    }

    public void setFields(GUI_Field[] fields) {
        this.fields = fields;
    }

    public void setUpFields() {

        /*
        ArrayList<Field> fieldsList = new ArrayList<>({
                new Field();
        }

        );

         */

        //Start MainGame.Field
        //fields[0] = new GUI_Start("Start", "", "You start here", Color.ORANGE, Color.WHITE);
        //fields[0] = new GUI_Start("Start", "", "You start here", Color.ORANGE, Color.WHITE);

        // Fylder resten af feltenre ud med veje
        for (int i = 1; i < 24; i++) {
            if (i % 2 == 0)
                fields[i] = new GUI_Street(
                        "Street " + i,
                        "Price: " + (i * 50),
                        "This is a street",
                        "100",
                        Color.PINK,
                        Color.WHITE
                );
            else
                fields[i] = new GUI_Street(
                        "Street " + i,
                        "Price: " + (i * 100),
                        "This is a street",
                        "50",
                        Color.BLUE,
                        Color.WHITE
                );
        }
    }
}


//GUI_Field guiField1 = new MainGame.Field(Color.BLUE, Color.white, MainGame.FieldConstants.TOWER_ID, MainGame.FieldConstants.TOWER_AMOUNT, MainGame.FieldConstants.TOWER_NAME, MainGame.FieldConstants.TOWER_TEXT);
//GUI_Field guiField1 = new MainGame.Field(Color.BLUE, Color.white);
//GUI_Field guiField1 = new(bgColor, fgColor, title, subText, description, BorderFactory.createLineBorder(Color.BLACK));
//GUI_Field guiField1 = new GUI_Field(Color.BLUE, Color.GREEN, "Test Title", "Test Subtext", "Description Test", BorderFactory.createLineBorder(Color.BLACK));

        /*
        // Laver ét af hvert felt
        GUI_Field[] fields = {
                new GUI_Start(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Jail(),
                new GUI_Shipping(),
                new GUI_Brewery(),
                new GUI_Refuge()
        };

         */
