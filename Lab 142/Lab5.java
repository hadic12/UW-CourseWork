import java.util.Scanner;
import java.util.*;
/**
 * Description of this class here
 */
public class Lab5 {
    public static void main(String[] args)  {
        System.out.println("Welcome to Lab5!");
        printMenu();

        while (true)
        {
            //Scanner object to get the input through keyboard
            Scanner input = new Scanner(System.in);
            System.out.println("What is your choice?");
            int choice = input.nextInt();
            int x=0;
            switch (choice)
            {
                case 1:
                    System.out.println("Will be rich on.....");
                    getRichQuick();
                    break;
                case 2:
                    System.out.println("Enter an x: ");
                    eTaylor( x = input.nextInt());
                    System.out.println("e^"+x+" = "+Math.exp(x));
                    break;
                case 3:
                    palindromeCheck();
                    break;
                case 4:
                    printMenu();
                    break;
                case 0:
                    System.out.println("Thanks for participating");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }

    // Part 1
    public static void getRichQuick() {
        double i = 0;
        int day = 0;
        double value = 0;

        while ( value < 1000000){
            value = value + (1 + (value/2)); // i = 0.5, value = 1 and day = 0 after putting this loop through the debugger (part 5).
            System.out.println("Day " + day + ": $" + i + " ($1 + " + (i/2) + ") = " + value); 
            i = value/2;
            day++;
        }
    }

    // Part 2 
    public static double eTaylor( double x ) {
        double taylorNumber = 0.0;
        // Your logic goes here
        double term = 1;
        int n = 0;
        while (term > 10e-16) {
            taylorNumber += term;
            n++;
            term = eTaylorHelper(x , n);
        }

        return taylorNumber;
    }

    public static double eTaylorHelper(double x, int n){
        double power = 1;
        double factorial = 1;

        for(int i = 1; i <= n; i++){
            power = power * x;
            factorial = factorial * i;
        }

        return power / factorial;
    }

    // Part 3
    /**
     * This program reads words, identifies, counts and writes all the palindromes 
    and the total
     * palindrome count.
     * 
     * // hint 1: Using keybord.next() will only return what comes before a space.
    // hint 2: Using keybord.nextLine() automatically reads the entire current 
    line.
     */
    public static void palindromeCheck(){
        String someWord = ""; // Stores words read from user input
        int count = 0;        // keeps track of Palindrome words only (define 
        //algorithm to count # of palindrome words
        int total = 0;        // Counts the total number of lines read from the 
        //given text file
        System.out.println(" Enter some words separated by white space");    // Ask 
        //for user input

        // declare your Scanner object here
        Scanner keyboard = new Scanner(System.in);
        // for each word user enters
        while (keyboard.hasNext()) {
            someWord = keyboard.next();          // store each word in a string 
            //variable and then do your operations
            total++;                             // increment number of words as you
            boolean pal = true ;

            for(int i = 0; i < someWord.length()/2; i++){
                char firstChar = someWord.charAt(i);
                char secondChar = someWord.charAt(someWord.length() - 1 - i);
                if (firstChar != secondChar) {
                    pal = false;
                }
            }

            if (pal == true){
                count++;
            }

            System.out.println("  " + total + " " + someWord);   // test
            System.out.println("There are " + count + " Palindromes out of " + total + " words provided by the user.");
        }
    }

    public static void printMenu()
    {
        System.out.println("Enter 1 to check how long it takes to get rich on a magic dollar coin.\n" +
            "Enter 2 to calculate e^x for any real x.\n" +
            "Enter 3 to enter palindrome words.\n" +
            "Enter 4 to re-print the menu.\n" +
            "Enter 0 to exit.");
    }
}