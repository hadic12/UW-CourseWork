import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Author: Hadi Chohan.
 * Description:
 * This program reads a file of strings and extracts fractions from it. Those
 * fractions are then
 * reduced and then matched with each other to count their occurences which are
 * then displayed alongside the
 * simplest form of each fraction.
 * 
 * Pre conditions:
 * The file should only contain fractions.
 * The fractions should not contain 0 in the denominator.
 * 
 * Post conditions:
 * The program will display simplified fractions and their occurences.
 */

/**
 * Q1) Can you complete this without using arrays? What is the least number of
 * variables you can use to solve this problem?
 * Ans: Yes we can and we would need at least three variables to do this which
 * are numerator, denominator and count.
 * 
 * Q2) Can you use just one array to solve this? What would the data type be of
 * that array?
 * Ans: Yes and the data type would String.
 * 
 * Q3) What does it mean to make a class so another class is inside (or part of)
 * the first class,
 * so that it is composed of other data types? What does "composition" mean in
 * that case? How is it done?
 * Ans: I think it would look like a nested loop where i and j could be
 * different data types.
 * The composition would mean that the second nested class would act as a
 * funnction of the first class.
 * 
 * Q4) What are some solutions to the reduction problem other than Euclid's GCD
 * algorithm?
 * Ans: LCM which is least common multiple. HCF could also be one but it is very
 * similar
 * as it is Highest common factor while GCD is greatest common divisor.
 */

public class FractionsV1 {
    public static void main(String[] args) {
        Scanner input = null;// reading file for its content
        int length = fileSize("C://fractions.txt");// size of file
        int index = 0;// index of arrays'
        int count;// Number of occurences
        int[] reducedNumerator = new int[length];// Simplified numerator
        int[] reducedDenominator = new int[length];// Simplified denominator
        Boolean[] counted = new Boolean[length];// Keeps track of counted fraactions
        Boolean[] displayed = new Boolean[length];// Keeps track of displayed fractions

        // Initializing boolean arrays
        for (int a = 0; a < length; a++) {
            counted[a] = false;// Checks if the fraction already counted
            displayed[a] = false;// Checks if the fraction is already displayed
        }

        try {
            // File reading for content of file
            File file = new File("C://fractions.txt");
            input = new Scanner(file);
        }

        catch (FileNotFoundException e) {// Exception handling
            System.out.println("File not found");
        }

        while (input.hasNextLine()) {// Moving through the file
            String lineRead = input.nextLine();// Reading the lines

            // Turning Strings into integers
            int numerator = Integer.parseInt(lineRead.split("/")[0]);
            int denominator = Integer.parseInt(lineRead.split("/")[1]);

            if (denominator != 0) {// Denominator cannot be zero
                // Euclid's GCD algorithm
                int divisor = gcd(numerator, denominator);
                reducedNumerator[index] = numerator / divisor;// reducing numerator
                reducedDenominator[index] = denominator / divisor;// reducing denominator
                index++;
            }

            else {
                System.out.println("Math Error");// Exception handling
            }
        }

        for (int i = 0; i < reducedNumerator.length; i++) {// Counts occurences
            count = 0;
            int numerator = reducedNumerator[i];
            int denominator = reducedDenominator[i];

            for (int j = 0; j < reducedNumerator.length; j++) {// Checks's counted occurences and displays them
                                                               // accordingly
                // If fraction is not already counted, the count increases, otherwise, it
                // remains the same (1)
                if (!counted[j]) {
                    if (reducedNumerator[j] == numerator && reducedDenominator[j] == denominator) {
                        counted[j] = true;
                        count++;
                    }
                }
            }

            // Printing only the first occurence of a fraction
            if (!displayed[i]) {
                System.out.println(numerator + "/" + denominator + " has count = " + count);
            }

            // Forcing remaining occurences to not be displayed
            for (int j = 0; j < reducedNumerator.length; j++) {
                if (!displayed[j]) {
                    if (reducedNumerator[j] == numerator && reducedDenominator[j] == denominator) {
                        displayed[j] = true;
                    }
                }
            }
        }
    }

    // Euclid's GCD Algorithm method
    public static int gcd(int numerator, int denominator) {
        /**
         * if (denominator == 0) {
         * return numerator;
         * } else {
         * return gcd(denominator, numerator % denominator);
         * }
         */
        return denominator == 0 ? numerator : gcd(denominator, numerator % denominator);
    }

    // Calculating file size
    public static int fileSize(String path) {
        Scanner input = null;// reading for calculating length
        int size = 0;

        try {
            // File reading for size of file
            File file = new File("C://fractions.txt");
            input = new Scanner(file);
        }

        catch (FileNotFoundException e) {// Exception handling
            System.out.println("File not found");
        }

        while (input.hasNextLine()) {// Calculating full length of file
            input.nextLine();
            size++;
        }

        return size;
    }
}