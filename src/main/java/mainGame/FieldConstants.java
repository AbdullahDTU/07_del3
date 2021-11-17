package mainGame;

//Easy editable Variables containing the Title, Rent, Description and Subtext
public class FieldConstants {
    //Title of field
    public static final String START_NAME = "START";
    public static final String CHANCE_NAME = "?";
    public static final String JAIL_NAME = "JAIL";
    public static final String PARKING_NAME = "FREE PARKING";
    public static final String BURGER_NAME = "BURGER HOUSE";
    public static final String PIZZA_NAME = "PIZZA HOUSE";
    public static final String SWEET_NAME = "SWEETS SHOP";
    public static final String ICECREAM_NAME = "ICECREAM SHOP";
    public static final String MUSEUM_NAME = "MUSEUM";
    public static final String LIBRARY_NAME = "LIBRARY";
    public static final String SKATER_NAME = "SKATER PARK";
    public static final String POOL_NAME = "SWIMMING POOL";


    //Rent of field
    public static final String BURGER_RENT = "1";
    public static final String PIZZA_RENT = "1";
    public static final String SWEET_RENT = "1";
    public static final String ICECREAM_RENT = "1";
    public static final String MUSEUM_RENT = "2";
    public static final String LIBRARY_RENT = "2";
    public static final String SKATER_RENT = "2";
    public static final String POOL_RENT = "2";

    //Description of field
    public static final String START_DESCRIPTION = "Recieve 1M when passing or landing here";
    public static final String CHANCE_DESCRIPTION = "Draw a Chance card";
    public static final String JAIL_DESCRIPTION = "You are now in Jail";
    public static final String PARKING_DESCRIPTION = "You are parking for free";
    public static final String BURGER_DESCRIPTION = String.format("Buy this field for %S M", BURGER_RENT);
    public static final String PIZZA_DESCRIPTION = String.format("Buy this field for %S M", PIZZA_RENT);
    public static final String SWEET_DESCRIPTION = String.format("Buy this field for %S M", SWEET_RENT);
    public static final String ICECREAM_DESCRIPTION = String.format("Buy this field for %S M", ICECREAM_RENT);
    public static final String MUSEUM_DESCRIPTION = String.format("Buy this field for %S M", MUSEUM_RENT);
    public static final String LIBRARY_DESCRIPTION = String.format("Buy this field for %S M", LIBRARY_RENT);
    public static final String SKATER_DESCRIPTION = String.format("Buy this field for %S M", SKATER_RENT);
    public static final String POOL_DESCRIPTION = String.format("Buy this field for %S M", POOL_RENT);

    //Subtext of field
    public static final String START_SUBTEXT = "";
    public static final String CHANCE_SUBTEXT = "CHANCE";
    public static final String JAIL_SUBTEXT = "JAIL";
    public static final String PARKING_SUBTEXT = "";
    public static final String BURGER_SUBTEXT = BURGER_RENT + "M";
    public static final String PIZZA_SUBTEXT = PIZZA_RENT + "M";
    public static final String SWEET_SUBTEXT = SWEET_RENT + "M";
    public static final String ICECREAM_SUBTEXT = ICECREAM_RENT + "M";
    public static final String MUSEUM_SUBTEXT = MUSEUM_RENT + "M";
    public static final String LIBRARY_SUBTEXT = LIBRARY_RENT + "M";
    public static final String SKATER_SUBTEXT = SKATER_RENT + "M";
    public static final String POOL_SUBTEXT = POOL_RENT + "M";


}
