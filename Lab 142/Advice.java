//necessary imports for file i/o
import java.io.FileInputStream;         //"turns" the file into a read stream
import java.util.Scanner;               //reads from stream
import java.io.IOException;             //this exception must be caught and handled when dealing with streams!         
import java.io.FileOutputStream;       //"turns" the file into a write stream
import java.io.PrintWriter;            //writes to the stream
import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!
import java.io.FileWriter;
import java.io.File;

/**
 * Write a description of class Diary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Advice
{

    public static String fileName = "advice.txt";
    public static String logFileName= "adviceLog.txt";

    public static void main(String[]args)throws IOException
    {
        Scanner inFile = null, 
        logFile = null, 
        keyboard = new Scanner(System.in);

        String advice;

        // checking if the two files exist
        File mainFile = new File(fileName);
        File logsFile = new File(logFileName);
        if(!mainFile.exists())
        {
            mainFile.createNewFile();
            System.out.println("advice.txt file has been created!");
        }
        if(!logsFile.exists())
        {
            logsFile.createNewFile();
            System.out.println("adviceLog.txt file has been created!");
        }

        try
        {
            inFile = new Scanner(mainFile);

            // if advice.txt file is empty
            if(!inFile.hasNextLine())
            {
                System.out.println("\nThere is no advice to display!");
                System.out.print("Please enter an advice to start with: ");
            }
            else
            {
                // if not, print the advice from the file
                while(inFile.hasNextLine())
                {
                    System.out.println("\nAdvice: " + inFile.nextLine().trim());
                }
                inFile.close();
                System.out.print("Please enter a new advice: ");
            }

            // user input for a new advice
            keyboard = new Scanner(System.in);
            advice = keyboard.nextLine().trim();
            String current = "";
            // writing the new advice to the file: advice.txt

            while(!current.equalsIgnoreCase("quit")){
                current = keyboard.nextLine();
                advice += current;
                advice += System.lineSeparator();

            }
            FileWriter inFileWriter = new FileWriter(fileName);
            inFileWriter.write(advice);
            System.out.println("\nAdvice has been written to file: " + fileName);
            inFileWriter.close();

            // appending the new advice to the file: adviceLog.txt
            FileWriter logFileWriter = new FileWriter(logFileName, true); 
            logFileWriter.write("Advice Log: " + advice + System.lineSeparator());
            System.out.println("Advice has been written to file: " + logFileName);
            logFileWriter.close();

        }catch(FileNotFoundException fnfe){
            System.out.println("advice.txt could not be found!");
        }catch(IOException ioe){
            System.out.println("Error in writing to advice.txt file");
        }
    }
}
