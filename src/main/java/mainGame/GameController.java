package mainGame;

import dies.Dice;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.util.ArrayList;
import java.util.Objects;

public class GameController {
    private GUI gui;
    private Dice dice;
    private Cars cars;
    private boolean gameHasFinished = false;
    private int playerAmount;
    private ArrayList<String> playerNames = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    private String[] playerOrderText = {"first player's name", "second player's name", "third player's name", "fourth player's name"};

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
        welcomeSetup();
    }

    public void welcomeSetup() {
        //Welcome message
        welcomeMessage();
        //Player inserts amount of players in the game between 2 and 4
        getPlayerAmount();
        //For loop to add each player inserted name into the game
        getPlayerNames();
        //Creates the players
        setUpPlayers();
    }

    public void setUpPlayers() {
        //Creates the players from names inputted earlier
        int i = 0;
        for (String playerName : playerNames) {

            Player createdPlayer = createPlayer(
                    playerName,
                    PlayerConstants.PLAYER_START_BALANCE,
                    cars.getCars()[i]
            );
            i++;

            //Adds created players to GUI
            gui.addPlayer(createdPlayer.getGUIPlayer());
        }
    }

    public void welcomeMessage() {
        //Welcome message
        gui.showMessage("Welcome to Monopoly Juniour");
    }

    public void getPlayerAmount() {
        //Player inserts amount of players in the game between 2 and 4
        playerAmount = gui.getUserInteger("Select amount of players. Between 2-4 Players: ", PlayerConstants.PLAYER_AMOUNT_MIN, PlayerConstants.PLAYER_AMOUNT_MAX);
    }

    public void getPlayerNames() {
        //For loop to add each player inserted name into the game
        for (int currentPlayer = 0; currentPlayer < playerAmount; currentPlayer++) {
            while (true) {
                String playerName = gui.getUserString("Enter the " + playerOrderText[currentPlayer]);
                playerNames.add(playerName);

                break;
            }
        }
    }

    //Method to create players
    public Player createPlayer(String playerName, int playerBalance, GUI_Car car) {
        GUI_Player GUIPlayer = new GUI_Player(playerName, playerBalance, car);
        Player player = new Player(PlayerConstants.START_FIELD, GUIPlayer);
        players.add(player);

        return player;
    }

    protected void startGame() {
        //Do loop to constantly run the game while gameHasFinished is false
        do {
            this.playRound();
        } while (!gameHasFinished);
    }

    private boolean playerWishesToRollDice() {
        //Makes a pressable button called "Roll the dice"
        String choice = gui.getUserButtonPressed("Roll the dice:", "Roll");
        return choice.equals("Roll");
    }

    public void playRound() {
        for (Player player : this.players) {

            if (playerWishesToRollDice()) {
                //Roll the Dice
                dice.rollTheDice();
            }

            //Sets diceValue to sum of dice
            int diceValue = getDice().getSum();

            //Displays the rolled dice on the Board
            gui.setDice(getDice().getRollingDice().get(0).getFaceValue(), getDice().getRollingDice().get(1).getFaceValue()); // Dice value with 1 and 2

            //Get current and new player positions
            int currentPlayerPosition = player.getPosition();
            int newPlayerPosition = calculateNewPlayerPosition(currentPlayerPosition, diceValue);

            System.out.println(currentPlayerPosition);

            //Gets new player position in GUI
            GUI_Field newGUIField = gui.getFields()[newPlayerPosition];

            //Visually sets player position to new position on the board
            player.getGUIPlayer().getCar().setPosition(newGUIField);

            //Sets player position to new position
            player.setPosition(newPlayerPosition);

            //Price of field
            int priceOfField = getFieldPrice(newPlayerPosition, player);
            System.out.println("priceOfField: " + priceOfField);

            int currentPlayerBalance = player.getGUIPlayer().getBalance();
            System.out.println("CurrentPlayerBalance: " + currentPlayerBalance);

            //Substracts price of field from player balance
            changePlayerBalance(priceOfField, player);

            hasPlayerLost(player);
        }
    }

    public void hasPlayerLost(Player player) {
        if (player.getGUIPlayer().getBalance() <= 0) {
            gameHasFinished = true;
            gui.showMessage(player.getGUIPlayer().getName() + " has lost all their money. Game over!");
        }
    }

    //Changes player's balance
    public void changePlayerBalance(int priceOfField, Player player) {
        int playerBalance = player.getGUIPlayer().getBalance();
        int newPlayerBalance = calculateNewPlayerBalance(playerBalance, priceOfField);

        //Changes player balance to new and displays it
        player.getGUIPlayer().setBalance(newPlayerBalance);

        System.out.println("NewPlayerBalance: " + newPlayerBalance);
    }

    //Calculates new player balance
    public int calculateNewPlayerBalance(int playerBalance, int priceOfField) {
        int newPlayerBalance = playerBalance - priceOfField;

        if (Objects.equals(newPlayerBalance, 0)) {
            System.out.println("Returned 0");
            return 0;
        } else {
            System.out.println("Returned Rest");
            return newPlayerBalance;
        }
    }

    public int getFieldPrice(int newPlayerPosition, Player player) {
        GUI_Field fieldsFromGUI = gui.getFields()[newPlayerPosition];

        //Sets fieldPriceStr to the field's subtext
        String fieldPriceStr = fieldsFromGUI.getSubText();

        System.out.println("fieldPriceStr: " + fieldPriceStr);

        //Returns string of field price with only numbers
        String fieldPriceNumberOnly = fieldPriceStr.replaceAll("[^0-9]", "");

        //Turns the string field price into an integer and returns it
        return Integer.parseInt(fieldPriceNumberOnly);
    }

    //Calculates the new player position after throwing dice
    private int calculateNewPlayerPosition(int currentPlayerPosition, int diceRollSum) {
        int possibleNewPosition = currentPlayerPosition + diceRollSum;
        int numberOfFields = this.gui.getFields().length;

        int modulosResult = Math.floorMod(possibleNewPosition, numberOfFields);

        if (Objects.equals(modulosResult, 0)) {
            return 0;
        } else {
            return modulosResult;
        }
    }

}
