package mainGame;

import gui_main.GUI;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI(Field.getFields(), new Color(176, 234, 220));
        GameController gameController = new GameController(gui);

        gameController.initGame();
        gameController.startGame();
    }

}