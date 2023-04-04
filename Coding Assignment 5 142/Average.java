import java.util.Scanner;// imported Scanner
public class Average { 
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); 
        double n = 0.0; // Changed int to double
        double x = 0.0; // declared and intialized x before the print statement with right data type.
        double y = 0.0; // New to store x.

        System.out.println("This program calculates the average (mean) of entered numbers.");  
        // Changed both print statements, did not need additional + and moved them on the same line as well.

        do { // Logic fixed.
            System.out.println("Enter another number (or 0 to stop and show the average): ");  
            x = scanner.nextDouble();
            y += x;
            n++; 
        } while (x != 0); 

        double a = y / n; // new variable for calculation and for use in printf statement. a stands for average.
        System.out.printf("Your final average is: %4.2f", a); //Used printf statement instead of println.
    } 
} 
 