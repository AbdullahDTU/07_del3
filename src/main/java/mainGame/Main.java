package mainGame;

import dies.Die;
import dies.Dice;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI(Field.getFields(), new Color(176, 234, 220));
        GameController gameController = new GameController(gui);

        //Arraylist for GUI Fields
        //GUI_Field[] guiFields = new GUI_Field[24];
        //MainGame.Field objects
        GUI_Field field;

        //Sets the start field
        GUI_Field[] fields = gui.getFields();
        field = fields[0];

        // Creating players with a name and balances
        GUI_Player player = new GUI_Player("Stephen", 20000);

        //Adds the players to the game
        gui.addPlayer(player);

        gameController.initGame();
        gameController.startGame();
    }

}