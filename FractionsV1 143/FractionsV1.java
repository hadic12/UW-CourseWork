import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class  FractionsV1 {
    
    public static void main(String args[]) {
        //Reads file containing fractions
        Scanner inputFile = null;
        //variables
        int length;
        length = FileSize();
        String[] fractions = new String[length]; //will take in the fractions
        String[] split = new String[2]; //used to split the fractions
        int[] numerator = new int[65]; //store numerators
        int[] denominator = new int[65]; //store denominators
        int duplicate = 0; //number of fractions that are the duplicate
        boolean[] counted = new boolean[100];

        try {
            inputFile = new Scanner(new FileInputStream("C:\\Users\\hadic\\OneDrive\\Desktop\\FractionsV1\\fractions.txt"));
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        //count the number of lines in the file, put each line into the string[] fractions
        for (int i = 0; inputFile.hasNextLine(); i++){
            fractions[i]=inputFile.nextLine();
            //count++;
        }

        //split the fractions[] into two arrays: numerator and denominator
        for(int i = 0; i < length; i++){
            split = fractions[i].split("/");
            numerator[i] = Integer.parseInt(split[0]);
            denominator[i] = Integer.parseInt(split[1]);

        }

        for (int i = 0; i<length; i++) {
            split = asFraction(numerator[i], denominator[i]).split("/");
            numerator[i] = Integer.parseInt(split[0]);
            denominator[i] = Integer.parseInt(split[1]);
            if (denominator[i] == 0) {
                System.out.print("\n Not divisiible fraction");
            }
        }

        //used to compare specific numerator and denominator to the rest of the numbers
        int num;
        int den;

        //start off by comparing denominator, and then compares the numerator of like denominators.
        for(int i = 0; i < length; i++){ 
            den = denominator[i];
            num = numerator[i];

            for(int a = 0; a < length; a++){
                if (!counted[a]) {
                    if(den == denominator[a]){ //compare denominators
                        if(num == numerator[a]){ //compare numerators
                            duplicate++;
                            counted[a] = true;
                        }
                    }
                }
            }

            if (duplicate>0) {
                System.out.println(num + "/" + den + " has a count of "+ duplicate);
            }  
            duplicate = 0;
        }
    }
    
    public static int FileSize() {
        //Reads file containing fractions
        Scanner inputFile = null;
        int len = 0;

        try {
            inputFile = new Scanner(new FileInputStream("C:\\Users\\hamza\\eclipse-workspace\\assignment1\\src\\assignment1\\fractions.txt"));

            while(inputFile.hasNext()) {
                System.out.print(inputFile.nextLine()+"\n");
                len++;
            }
            inputFile.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }
        return len;
    }
    
    /*    if(b==0) {
           a = gcd(b , a % b);
    } return a
    //** @return the greatest common denominator */
    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static String asFraction(long a, long b) {
        long gcd = gcd(a, b);
        return (a / gcd) + "/" + (b / gcd);
    }
}