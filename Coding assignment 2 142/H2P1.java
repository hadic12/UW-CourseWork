
/**
 * This a a program that takes user input of three value named "a", "b" and "c"
 * and calculates the equation: y = ax^2 + bx + c. It then gives the vertex coordinates 
 * and tells if the vertex has zeroes as well as if the vertex has a y-intercept value.
 */
import java.util.Scanner;
public class H2P1
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //Value a, b and c will be entered by user
        System.out.println("Enter a, b and c of your quadratic function (separated by spaces):");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
                
        //Formulae for calculating vertex.
        double x = (-b)/(2*a);
        double y = (a*(x*x)) + (b*x) + c;
        
        //Letting the user know their input.
        System.out.println("\nYou entered " + a + " for \"a\" value, " + b + " for \"b\" value and " + c + " for \"c\" value" );
        
        /* Conditions for the vertex to be met for being the zero or y-intercept or being both of the parabola.
         * Depending on the outcome, if the y = c and/or y = 0, the messages will be displayed, otherwise, only the vertex will be displayed.  
         */
        if  (y == c && y == 0){
            System.out.printf ("\nThe vertex of the corresponding parabola is: (%4.1f, %4.1f)%n", x, y );
            System.out.println("The vertex is also the zero of your parabola.");
            System.out.println("The vertex is also the y-intercept of your parabola.");
        }
        
             
        else if (y == c && y != 0){
            System.out.printf ("\nThe vertex of the corresponding parabola is: (%4.1f, %4.1f)%n", x, y );
            System.out.println("The vertex is also the y-intercept of your parabola.");
        }
        
        else if (y != c && y == 0){
            System.out.printf ("\nThe vertex of the corresponding parabola is: (%4.1f, %4.1f)%n", x, y );
            System.out.println("The vertex is also the zero of your parabola.");
        }
        
        else  {
            System.out.printf ("\nThe vertex of the corresponding parabola is: (%4.1f, %4.1f)%n", x, y );
        }
}
}
