import java.util.Scanner; 
     /*
 * Lab2b.java
 *
 * Authors: Samantha Smith, you
 */
// TODO: Do you need any imports?
public class Lab2b {
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your name followed by three numbers (space separated):");
    String name = keyboard.next();
    double num1 = keyboard.nextDouble();
    double num2 = keyboard.nextDouble();
    double num3 = keyboard.nextDouble();
       
       
    double max = Math.max(Math.max(num1, num2), num3);
        double min = Math.min(Math.min(num1, num2), num3);
        double mid = num1 + num2 + num3 - max - min;
        
    System.out.println("Hi there, " + name + "! Here are the numbers you entered in descending order:");
    System.out.printf("%4.1f %4.1f and %4.1f %n", max, mid, min);
    System.out.println("Thank you for using the three-number-sorting system! Good-bye.");
}//I tested it out with several inputs, it worked with them all.
// Declare a sortDescending method that will take three doubles (optional)
}

