
/**
 * Author: Hadi Chohan
 * Description:
 * This class is the driver class that extracts text from the file, puts 
 * it through other classes. It then tests and displays results.
 * 
 * Preconditions:
 * The file should only contain fractions.
 * 
 * Postcondition:
 * It will test and display the result.
 */

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class FractionDriver {
    public static void main(String[] args) {
        Scanner input = null;// Reads the file
        ArrayList<Fraction> fractions = new ArrayList<Fraction>();// Stores fractions
        ArrayList<FractionCounter> counter = new ArrayList<FractionCounter>();// Stores the occurence of each fraction

        try {// File reading
            File file = new File("C://fractions2.txt");// Allocating which file to read
            input = new Scanner(file);// Cursor
            while (input.hasNextLine()) {// Reading each line
                String fileRead = input.nextLine();// Moving the cursor to each line

                // Parsing text into integers based on the "/" (either left integer or right of
                // the "/").
                int numerator = Integer.parseInt(fileRead.split("/")[0]);// Parsing the text into numerator
                int denominator = Integer.parseInt(fileRead.split("/")[1]);// Parsing the text into denominator
                Fraction element = new Fraction(numerator, denominator);// Storing integers into Fraction class
                fractions.add(element);// Adding the reduced fractions in array list
            }

            input.close();// Closing file scanner
        }

        catch (FileNotFoundException e) {// Exception handling
            System.out.println(e);
        }

        int length = fractions.size();// Calculates file size and assigns it to another variable
        boolean flag = false;// variable to keep check of occurences

        // Loop to iterate through all the fractions
        for (int h = 0; h < length; h++) {
            Fraction temp = fractions.get(h);// Using temperory variabele to store individual fractions
            if (counter.isEmpty()) {// If the counter array list is empty
                counter.add(new FractionCounter(temp));// add new fraction occurence
            }

            else {// This loop will iterate over all the fractions in the counter array list
                for (int i = 0; i < counter.size(); i++) {
                    if (counter.get(i).compareAndIncrement(temp)) {
                        flag = true;// hold true if the function above works
                    }
                }

                if (!flag) {// in case the fraction does not exist in the counter array list
                    counter.add(new FractionCounter(temp));// add new fraction using temporary variable
                    flag = false;// reset the flag
                }
            }

            flag = false;// reset the flag
        }

        for (int j = 0; j < counter.size(); j++) {// Print all the results in the counter array list
            System.out.println(counter.get(j).toString());
        }
    }
}
