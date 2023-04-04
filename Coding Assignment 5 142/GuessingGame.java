import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

/* This programs is a guessing game which asks the user to guess a randomly
 * generated number, the user will keep guessing untill the right answer.
 * After they win the game, they will be prompted whethery they want to 
 * play again or end the game.
 */
public class GuessingGame
{
    public static void main(String[] args) {
        gg();// gg stands for Good game.
    }

    public static void gg() throws InputMismatchException{// method to guess till the answer is right.
        Scanner keyboard = new Scanner(System.in);
        int rand = (int)(Math.random() * 100) + 1; 
        int g = 0; // g is for guess
        int i = 0; // i is for iterations
        boolean run = true;

        System.out.println("Please guess a number between 1 and 100: ");

        try {
            while (run == true){
                i++;
                g = keyboard.nextInt();
                if ( rand < g){
                    System.out.println("Too high!  Guess again: ");// Ask the user again for right answer.
                } 

                else if ( rand > g){
                    System.out.println("TOO low!  Guess again: ");// Ask the user agian for right answer.
                }

                else if (rand == g){
                    keyboard.nextLine();
                    System.out.println("Good job, you got it after " + i + " guesses! Want to play again (Y or N)?");
                    String response;
                    response = keyboard.nextLine();

                    switch (response){// After the game is finished, replay or end choice.
                        case "Y":
                        case "y":
                            gg();
                            break;
                        case "N":
                        case "n":
                            System.out.println("Thank you for playing.");
                            System.exit(0);
                        default:
                            System.out.println("Invalid command.");
                            System.exit(0);
                    }
                }
            }    
        }

        catch (InputMismatchException e){
            System.out.println("");
            gg();
        }
    }
}