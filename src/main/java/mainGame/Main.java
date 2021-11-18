package mainGame;

import gui_fields.*;
import gui_main.GUI;

public class Main {
    public static void main(String[] args) {

        GUI gui = new GUI(Field.getFields());

        //Arraylist for GUI Fields
        //GUI_Field[] guiFields = new GUI_Field[24];
        //MainGame.Field objects
        GUI_Field field;

        //Sets the start field
        GUI_Field[] fields = gui.getFields();
        field = fields[0];

        // Creating players with a name and balance
        GUI_Player player = new GUI_Player("Stephen", 2000);

        //Adds the players to the game
        gui.addPlayer(player);
    }
}