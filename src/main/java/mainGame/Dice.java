package mainGame;


import java.util.Random;

public class Dice {

    public static void main(String[] args) {

            Random Die1 = new Random();
            Random Die2 = new Random();

            // Die1 with added plus 1
            int x = Die1.nextInt(6);
            ++x;
            System.out.println(" Dice 1 rolled a "+ x);

            // Die2 with added plus 1
            int y = Die2.nextInt(6);
            ++y;
            System.out.println(" Dice 2 rolled a "+ y);

            int rollTotal = x + y;

            // If you rolled equal dice number
            if(Die1 == Die2) {
                System.out.println("You may roll again");

            }else {
                System.out.println("You total rolled is: " + rollTotal);

            }



        }

    }









