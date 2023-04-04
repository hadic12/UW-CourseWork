import java.util.Scanner;
import java.lang.Math;
public class Lab3c
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 0 for Rock or Enter 1 for Paper or Enter 2 for Scissor.");
        int a = keyboard.nextInt();
        int rand = (int)(Math.random() * 2);
        System.out.println("\nYou chose " + inToWord(a) + ". I choose " + inToWord(rand) + findWinner(a, rand)); 
    }

    public static String inToWord(int a){

        switch (a){
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissor";
            default:
                return "Invalid selection";
        }
    }

    public static String findWinner(int user, int compChoice){

        if (user == compChoice){
            return ". Tie.";
        }
        else if (user == 2 && compChoice == 0){
            return  ". Rock beats Scissor. I win.";
        }
        else if (user == 0 && compChoice == 2){
            return ". Rock beats Scissor. You win.";
        }
        else if (user == 0 && compChoice == 1){
            return ". Paper beats Rock. I win.";
        }
        else if (user == 1 && compChoice == 0){
            return ". Paper beats Rock. You win.";
        }
        else if (user == 1 && compChoice == 2){
            return ". Scissor beats Paper. I win.";
        }
        else if (user == 2 && compChoice == 1){
            return ". Scissor beats Paper. You win.";
        }
        else {
            return ". Invalid selection";
        }
    }
}
