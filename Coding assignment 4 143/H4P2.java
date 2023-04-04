import java.util.Random;
import java.util.Scanner;
/**
 * This program plays a simple game of pig with two players being the user(human) and the computer.
 * The user is given first turn by default and after every dice roll is prompted whether they
 * want to roll again or hold their current score and give the turn to computer. Computer can score
 * up to 20 points on each turn or roll a 1 which ends its turn but the user may keep rolling until
 * they roll a 1 or choose to hold their current score. On each roll, both the user's and computer's
 * points are accummulated and whoever reaches 100 first wins the game.
 */

public class H4P2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        int humanTotalScore = 0;// The variable to track human total score after each roll.
        int compTotalScore = 0;// The variable to track computer total score after each roll.
        int compSubTotal = 0;// The computer's score condition variable (cannot score more than 20 point on each turn).
        boolean run = true;// The run condition variable (break condition for loops).
        String response;// User prompt variable.
        int roll = 0;// The dice variable.

        //The big loop to keep the game running until either user or computer reaches 100 points to end the game.
        do 
        {
            System.out.println("*** Human's Turn ***");
            run = true;
            do { // The loop that starts the initial game and gives the first turn to user.
                roll = 1 + rand.nextInt(6);
                System.out.println("Human rolled " + roll + ".");

                /* The conditional that decides whether the user will miss their turn if 1 is rolled, otherwise, 
                 * it would prompt the user to input eith 'R' OR 'H'. It does not matter whether they are
                 * lower case or uppercase while 'R' means roll again and 'H' means hold the score and give turn 
                 * to computer. If the user enters anything other than 'R' or 'H', the game will automatically stop 
                 * and ask to be restarted due to an invalid command.
                 */
                if (roll == 1) { 
                    System.out.println("\nHuman's score: " + humanTotalScore 
                        + "\nComputer's score: " + compTotalScore);
                    run = false;
                }
                else {
                    humanTotalScore += roll;
                    System.out.println("\nHuman's score: " + humanTotalScore 
                        + "\nComputer's score: " + compTotalScore);

                    if (humanTotalScore >= 100) {
                        run = false;
                    }
                    else {
                        System.out.print("Enter 'R' to roll again or 'H' to hold: ");
                        response = keyboard.next();

                        if (response.equalsIgnoreCase("R")) {
                            run = true;
                        }
                        else if (response.equalsIgnoreCase("H")) {
                            run = false;
                        }
                        else {
                            System.out.println("Unfortunately the game has been ended untimely due to an Invalid command.");
                            System.out.println("Please restart it and follow the instructions promptly to finish the game in the correct manner.");
                            System.exit(0);
                        }
                    }
                }
            } while (run);
            /* The conditional below runs side by side with the second loop above as long as the user's score is below 
             * 100 to swicth from user to computer or vice versa and also simulate the computer's turn as long as it's
             * score is also below 100 for the game or below 20 for each turn. 
             */ 
            if (humanTotalScore < 100) {
                System.out.println("\n*** Computer's Turn ***");

                compSubTotal = 0;
                run = true;

                do {
                    roll = 1 + rand.nextInt(6);
                    System.out.println("\nComputer rolled " + roll + ".");

                    if (roll == 1) {
                        System.out.println("\nHuman's score: " + humanTotalScore 
                            + "\nComputer's score: " + compTotalScore);
                        run = false;
                    }
                    else {
                        compSubTotal += roll;
                        compTotalScore += roll;
                        System.out.println("\nHuman's score: " + humanTotalScore 
                            + "\nComputer's score: " + compTotalScore);

                        if (compSubTotal >= 20) {
                            System.out.println("Computer's subtotal >= 20.");
                            run = false;
                        }

                        if (compTotalScore >= 100) {
                            run = false;
                        }
                    }
                } while (run && compSubTotal < 20);
            }
            System.out.println();
        } while (humanTotalScore < 100 && compTotalScore < 100);

        if (humanTotalScore >= 100) {// The winning display resluts for both user nad computer.
            System.out.println("Human wins the game!\nCongratulations on winning.\nThank you for playing the pig game.");
        }
        else {
            System.out.println("Computer wins the game!\nBetter luck next time.\nThank you for playing the pig game.");
        }

        keyboard.close();// Closing the keyboard after the game ends.
    }
}
