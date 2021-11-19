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

        // Creating players with a name and balances
        GUI_Player player = new GUI_Player("Stephen", 20000);

        //Adds the players to the game
        gui.addPlayer(player);


        gui.setDice(1, 2); // Showing to Dices with value

        while(true){
            // Input from player
            String choice = gui.getUserButtonPressed("Please choice", "Roll with 1 dice", "Rolle with 2 dices");
            if( choice.equals("Roll with 1 dice") )
                gui.setDie(6); // Dice value with 6
            if( choice.equals("Rolls with 2 dices") )
                gui.setDice(1, 2); // Dice value with 1 and 2
        }




    }

}