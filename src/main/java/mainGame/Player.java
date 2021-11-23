package mainGame;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private ArrayList<Field> ownedProperties;
    private int position;
    private GUI_Player GUIPlayer;
    private String playerName;
    private int playerBalance;
    private int playerAmount;

    public ArrayList<Field> getOwnedProperties() {
        return ownedProperties;
    }

    public void setOwnedProperties(ArrayList<Field> ownedProperties) {
        this.ownedProperties = ownedProperties;
    }

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

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerBalance() {
        return playerBalance;
    }

    public void setPlayerBalance(int playerBalance) {
        this.playerBalance = playerBalance;
    }

    public int getPlayerAmount() {
        return playerAmount;
    }

    public void setPlayerAmount(int playerAmount) {
        this.playerAmount = playerAmount;
    }

    //Player constructor
    public Player(int startField, GUI_Player GUIPlayer) {
        this.position = startField;
        this.GUIPlayer = GUIPlayer;
        this.ownedProperties = new ArrayList<>();
    }

}
