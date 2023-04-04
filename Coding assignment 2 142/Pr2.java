import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Pr2{
    public static void main(String [] args){
        writeFile();
    }
    
    public static void writeFile(){
        Scanner input = null;
        PrintWriter output = null;
        File file = new File("fileIn.txt");
        
        try{
            output = new PrintWriter(new FileOutputStream(file));
            
            for (int i = 1; i <= 5; i++){
                output.println(i * 100);
            }
            output.close();
            
            input = new Scanner(file);
            
            while (input.hasNextLine()){
                System.out.print(input.nextLine() + " | ");
            }
            input.close();
        }
        
        catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}