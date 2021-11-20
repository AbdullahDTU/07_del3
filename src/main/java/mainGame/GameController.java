package mainGame;

import dies.Dice;
import dies.Die;
import gui_main.GUI;

public class GameController {
    private GUI gui;
    private Dice dice;
    private boolean gameHasFinished;

    public GameController(GUI gui) {
        this.gui = gui;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public void initDice() {
        this.dice = new Dice();
    }

    protected void initGame() {
        this.initDice();
        //this.initBoard();
    }

    protected void startGame() {
        //Do loop to constantly run the game while gameHasFinished is false
        do {
            this.playRound();
        } while (!this.gameHasFinished);
    }

    public void playRound() {

        //gui.setDice(1,2); // Showing to Dices with value
        while (true) {
            System.out.println("Done");
            //Makes a pressable button called "Roll the dice"
            String choice = gui.getUserButtonPressed("Roll the dice:", "Roll the dice");
            if (choice.equals("Roll the dice"))
                //Roll the Dice
                dice.rollTheDice();
            int diceValue = getDice().getSum();

            //Displays the rolled dice on the Board
            gui.setDice(getDice().getRollingDice().get(0).getFaceValue(), getDice().getRollingDice().get(1).getFaceValue()); // Dice value with 1 and 2
        }
    }
}
