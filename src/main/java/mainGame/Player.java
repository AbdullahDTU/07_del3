package mainGame;

import gui_fields.GUI_Player;

public class Player {
    private int position;
    private GUI_Player GUIPlayer;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public GUI_Player getGUIPlayer() {
        return GUIPlayer;
    }

    public void setGUIPlayer(GUI_Player GUIPlayer) {
        this.GUIPlayer = GUIPlayer;
    }

    //Player constructor
    public Player(int startField, GUI_Player GUIPlayer) {
        this.position = startField;
        this.GUIPlayer = GUIPlayer;
    }

}
