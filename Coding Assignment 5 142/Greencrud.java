//necessary imports for file i/o
import java.io.FileInputStream; //"turns" the file into a read stream
import java.util.Scanner; //reads from stream
import java.io.IOException; // Input/Output Exception
import java.io.File; 
import java.io.FileOutputStream; //"turns" the file into a write stream
import java.io.PrintWriter; //writes to the stream
import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!
/**
 * This program claculates a greencrud population using Fabionacci numbers calculation.
 * It reads from a file named greencrud.txt and displays the results in a file called
 * crudout.txt
 */
public class Greencrud {
    public static void main(String[] args) throws IOException{  
        // Scanner and PrintWritre must be declared outside the try block
        // otherwise their scope will be limited to within the block 
        Scanner input = null;
        PrintWriter output = null;
        StringBuilder string = new StringBuilder();

        try {// Reading from a file and writing to a file. Both done in the same try block.            
            input = new Scanner(new FileInputStream("greencrud.txt"));
            output = new PrintWriter(new FileOutputStream("crudout.txt"));
            while (input.hasNext()) { // until the text stops, it will keep reading.
                int a = input.nextInt(); // reading the numbers
                int day = input.nextInt();
                int result = calc(a, day);
                string.append("Initial population: " + a + " pounds. Time Frame: " + day + " days. " + "Final population: " + result + " pounds\n");
            } 
            input.close();
            output.write(string.toString().replaceFirst(",", ""));
            output.close();
        }
        catch (FileNotFoundException e) {// Separate catch blocks for input stream and output stream.
            System.out.println("File not found.");
            System.exit(0);
        } 
        catch (IOException e) {
            System.out.println("Sorry, we cannot locate the file!");
            System.exit(0);
        }  
    }  

    public static int calc(int a, int day){// Favionacci calculation method.
        int b = 0;
        int c = 0;
        //int d = b + c;

        while ( c <= day){
            int y = a + b;
            a = b;
            b = y;
            c = c + 5;
        }

        return b;
    }
}